package com.loye.account.dao;

import com.loye.account.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    @Select("select password,authority from loye_user where email= #{email,jdbcType=VARCHAR}")
    User getUserByEmail(String email);

    User getUserByMobilePhone(String mobile);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}