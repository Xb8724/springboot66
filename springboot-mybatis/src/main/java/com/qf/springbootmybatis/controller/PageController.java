package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("hello")
    public String hello(Model model){
        String username="马云";
        model.addAttribute("username",username);
        TUser user = new TUser(1L,"java1904","1234");

        model.addAttribute("user",user);
        model.addAttribute("money",100000);

        List<TUser> users=new ArrayList<>();
        users.add(new TUser(2L,"小赵姑娘","123"));
        users.add(new TUser(3L,"小霄小哥","123"));
        model.addAttribute("users",users);

        model.addAttribute("now",new Date());
        return "hello";
    }
}
