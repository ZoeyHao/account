package com.loye.account.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/signin",method = RequestMethod.POST)
    private String signin(){
        return "sign in success!";
    }

    @RequestMapping(value="/signup",method = RequestMethod.POST)
    private String signup(){
        return "sign up success!";
    }
}
