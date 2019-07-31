package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.TUser;
import com.qf.springbootmybatis.entity.User;
import com.qf.springbootmybatis.service.IUserService;
import com.qf.springbootmybatis.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("getById/{id}")
    public TUser getById(@PathVariable("id") Long id){
        return userService.getById(id);
    }

    @RequestMapping("add")
    public String get(@Valid User user, Model model){
        user.setAge(19);
        user.setEmail("416506304@qq.com");
        user.setName("xb");
        user.setPhone("13715111111");
        model.addAttribute("user",user);
        return "success";
    }
}
