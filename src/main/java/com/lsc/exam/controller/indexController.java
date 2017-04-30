package com.lsc.exam.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/4/30.
 */
@Controller
@Api(value = "系统管理", description = "系统管理")
@RequestMapping("/manage/system")
public class indexController {

    @ApiOperation(value = "系统首页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index.jsp";
    }
}
