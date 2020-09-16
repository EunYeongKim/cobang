package com.example.cobang.service;

import com.example.cobang.dto.User;
import com.example.cobang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserMapper userMapper;

    @Autowired
    UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getsUsers() {
        return userMapper.getUsers();
    }
}
