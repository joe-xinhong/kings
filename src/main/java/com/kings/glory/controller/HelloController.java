package com.kings.glory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
* @Description:    项目搭建成功第一个测试
* @Author:         Joe
* @CreateDate:     2019/9/22 14:09
*/
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "这就成功访问了";
    }
}
