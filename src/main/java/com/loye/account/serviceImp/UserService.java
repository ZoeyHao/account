package com.loye.account.serviceImp;

import com.loye.account.service.IUserService;

public class UserService implements IUserService {


    public static IUserService getInstance(){
        return instance;
    }

    private static IUserService instance = new UserService();

    private UserService() {}

    @Override
    public boolean signInByEmail(String email, String password) {
        return false;
    }

    @Override
    public boolean signInByMobilePhone(int mobilePhone, String password) {
        return false;
    }
}
