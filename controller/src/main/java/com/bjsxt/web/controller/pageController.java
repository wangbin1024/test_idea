package com.bjsxt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//页面跳转
@Controller
public class pageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable(value = "page") String page){
        return page;
    }
}
