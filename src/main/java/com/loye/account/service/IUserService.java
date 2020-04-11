package com.loye.account.service;

public interface IUserService {

    boolean signInByEmail(String email,String password);

    boolean signInByMobilePhone(int mobilePhone,String password);
}
