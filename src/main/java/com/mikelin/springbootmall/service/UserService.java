package com.mikelin.springbootmall.service;

import com.mikelin.springbootmall.dto.UserRegisterRequest;
import com.mikelin.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer id);
}
