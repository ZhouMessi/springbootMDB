package com.moredb.demo.controller;


import com.moredb.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser1/{id}")
    public String GetUser1(@PathVariable int id){
        return userService.Sel1(id).toString();
    }


    @RequestMapping("getUser2/{id}")
    public String GetUser2(@PathVariable int id){
        return userService.Sel2(id).toString();
    }
}
