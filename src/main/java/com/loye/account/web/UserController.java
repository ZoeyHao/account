package com.loye.account.web;

import com.loye.account.dto.Result;
import com.loye.account.service.IUserService;
import com.loye.account.serviceImp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.RescaleOp;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value="/signin",method = RequestMethod.POST)
    private Result signin(String login,String pwd,String code){
        Result<String> res=new Result();
        if(userService.signInByEmail(login,pwd)){
            res.setSuccess(true);
            res.setStatus(200);
            res.setData("登录成功，功能待开发中!");
        }
        res.setError("账号或者密码错误");
        return res;
    }

    @RequestMapping(value="/signup",method = RequestMethod.POST)
    private String signup(){
        return "sign up success!";
    }
}
