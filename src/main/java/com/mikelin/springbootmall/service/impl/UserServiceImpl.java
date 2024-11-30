package com.mikelin.springbootmall.service.impl;

import com.mikelin.springbootmall.dao.UserDao;
import com.mikelin.springbootmall.dto.UserRegisterRequest;
import com.mikelin.springbootmall.model.User;
import com.mikelin.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }
}
