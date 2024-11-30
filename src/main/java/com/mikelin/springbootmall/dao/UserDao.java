package com.mikelin.springbootmall.dao;

import com.mikelin.springbootmall.dto.UserRegisterRequest;
import com.mikelin.springbootmall.model.User;

public interface UserDao {

    public Integer createUser(UserRegisterRequest userRegisterRequest);

    public User getUserById(Integer id);
}
