package com.lsc.exam.controller;

import com.lsc.exam.base.BaseConstants;
import com.lsc.exam.base.BaseResult;
import com.lsc.exam.base.ResultEnum;
import com.lsc.exam.dao.model.TbExam;
import com.lsc.exam.dao.model.TbExamExample;
import com.lsc.exam.dao.model.TbQuestions;
import com.lsc.exam.generation.GA;
import com.lsc.exam.generation.Paper;
import com.lsc.exam.generation.Population;
import com.lsc.exam.generation.RuleBean;
import com.lsc.exam.service.api.TbExamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/5/3.
 */
@Controller
@Api(value = "试卷管理",description = "试卷管理")
@RequestMapping("/assemble")
public class AssembleController {

    @Autowired
    private TbExamService tbExamService;

    @ApiOperation(value = "自动组卷")
    @ResponseBody
    @RequestMapping(value = "/autoAssemble")
    public BaseResult autoAssemble(RuleBean rule){
        Paper resultPaper = null;
        // 迭代计数器
        int count = 0;
        int runCount = 100;
        // 适应度期望值
        double expand = 0.98;
        // 可自己初始化组卷规则rule
        if (rule != null) {
            // 初始化种群
            Population population = new Population(20, true, rule);
            System.out.println("初次适应度  " + population.getFitness().getAdaptationDegree());
            while (count < runCount && population.getFitness().getAdaptationDegree() < expand) {
                count++;
                population = GA.evolvePopulation(population, rule);
                System.out.println("第 " + count + " 次进化，适应度为： " + population.getFitness().getAdaptationDegree());
            }
            System.out.println("进化次数： " + count);
            System.out.println(population.getFitness().getAdaptationDegree());
            resultPaper = population.getFitness();
        }
        System.out.println(resultPaper);
        BaseResult result = new BaseResult(ResultEnum.SUCCESS,resultPaper);
        return result;
    }

    @ApiOperation(value = "保存试卷")
    @ResponseBody
    @RequestMapping(value = "/addexam")
    public BaseResult addexam(Paper paper){
        int count = 0;
        for(TbQuestions tbq : paper.getQuestionList()){
            TbExam exam = new TbExam();
            exam.setQuestionid(tbq.getId().intValue());
            exam.setTaotiid(paper.getTaotiId());
            exam.setStatus(BaseConstants.ALLOW);
            tbExamService.insert(exam);
            count++;
        }
        if(count == paper.getQuestionList().size()){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else{
            BaseResult result = new BaseResult(ResultEnum.FAILED_INSERT,null);
            return result;
        }
    }


}
