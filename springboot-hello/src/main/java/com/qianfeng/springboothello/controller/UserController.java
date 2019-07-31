package com.qianfeng.springboothello.controller;

import com.qianfeng.springboothello.entity.Resources;
import com.qianfeng.springboothello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("user")
public class UserController {

    @Value("${images.serverpath}")
    private String imageService;

    @GetMapping("properties")
    public String properties(){
        return "properties:"+imageService;
    }

    @Autowired
    private Resources resources;

    @GetMapping("class")
    public String properties1(){
        return resources.getEmailServer()+resources.getImageServer();
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello,springboot.!111111!..";
    }

    @RequestMapping("page")
    public String pageInfo(@RequestParam(value = "pagess",required = false,defaultValue ="11") Integer pageSize){
        return "pageSize:"+pageSize;
    }

    @GetMapping("page/{pageSize}")
    public String pageSize(@PathVariable("pageSize") Integer pageaize){
        return "pageSize2:"+pageaize;
    }

    @PostMapping("add")
    public User add(User user){
//        user.setDate(new Date());
        return user;
    }
}
