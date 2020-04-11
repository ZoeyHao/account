package com.loye.account.dao;

import com.loye.account.entity.User;

public interface UserDao {

    User getUserByEmail(String email);

    User getUserByMobilePhone(int mobilePhone);

    boolean signUp(String email,int mobilePhone);
}
