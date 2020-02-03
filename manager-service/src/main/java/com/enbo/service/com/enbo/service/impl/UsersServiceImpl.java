package com.enbo.service.com.enbo.service.impl;

import com.enbo.mapper.UsersMapper;
import com.enbo.pojo.Users;
import com.enbo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
