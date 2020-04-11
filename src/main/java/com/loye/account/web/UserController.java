package com.loye.account.web;

import com.loye.account.dto.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.RescaleOp;

@RestController
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @RequestMapping(value="/signin",method = RequestMethod.POST)
    private Result signin(String login,String pwd,String code){
        Result<String> res=new Result();
        res.setSuccess(true);
        res.setStatus(200);
        res.setData("登录成功，功能待开发中!");
        return res;
    }

    @RequestMapping(value="/signup",method = RequestMethod.POST)
    private String signup(){
        return "sign up success!";
    }
}
