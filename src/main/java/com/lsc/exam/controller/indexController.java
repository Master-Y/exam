package com.lsc.exam.controller;

import com.lsc.exam.service.api.TbStudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/30.
 */
@Controller
@Api(value = "考试管理系统", description = "考试管理系统")
@RequestMapping("/manage/system")
public class indexController {

    private TbStudentService tbStudentService;

    @ApiOperation(value = "登陆")
    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String login(String username,String psw,String type) {
        return "index.jsp";
    }
}
