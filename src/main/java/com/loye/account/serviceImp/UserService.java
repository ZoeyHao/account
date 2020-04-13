package com.loye.account.serviceImp;

import com.loye.account.dao.UserMapper;
import com.loye.account.entity.User;
import com.loye.account.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userDao;

    /*public static IUserService getInstance(){
        return instance;
    }

    private static IUserService instance = new UserService();

    private UserService() {}*/

    @Override
    public boolean signInByEmail(String email, String password) {
        User user=userDao.getUserByEmail(email);
        if(user==null){
            return false;
        }
        if(user.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    @Override
    public boolean signInByMobilePhone(int mobilePhone, String password) {
        return false;
    }
}
