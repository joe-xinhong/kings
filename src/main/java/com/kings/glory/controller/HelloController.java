package com.kings.glory.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* @Description:    项目搭建成功第一个测试
* @Author:         Joe
* @CreateDate:     2019/9/22 14:09
*/
@Api(tags = "测试接口")
@RestController
@Resource(description = "测试的接口")
public class HelloController {

    @ApiOperation(value="测试接口", notes="测试接口")
    @ApiImplicitParam(name = "id", value = "用户ID", required = false, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "这就成功访问了";
    }
}
