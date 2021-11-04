package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//处理用户请求
@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    //处理添加用户请求
    @RequestMapping("/addUsers")
    //spring自动注入Users 根据Users里的set方法，所以表单提交的name必须和Users里属性名字一致！
    public String addUsers(Users users){
        this.usersService.addUsers(users);
        return "redirect:/ok";
    }

    //处理查询所有用户请求
    @RequestMapping("/findUsers")
    public String findUsers(Model model){
       List<Users> list = this.usersService.findUsers();
       model.addAttribute("list",list);
       return "/showUsers";
    }

    //处理预更新用户的查询
    @RequestMapping("/preUpdateUser")
    public String preUpdateUser(Integer userid,Model model){
        Users users = this.usersService.findUserById(userid);
        model.addAttribute("users",users);
        return "/updateUsers";
    }

    //更新用户
    @RequestMapping("/updateUsers")
    public String updateUsers(Users users){
        this.usersService.modifyUsers(users);
        return "redirect:/ok";
    }

    //删除用户
    @RequestMapping("/deleteUsers")
    public String deleteUsers(Integer userid){
        this.usersService.dropUsers(userid);
        return "redirect:/ok";
    }
}
