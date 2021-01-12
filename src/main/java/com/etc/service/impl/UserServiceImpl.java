package com.etc.service.impl;

import com.etc.dao.UserDao;
import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User findByNameAndPassword(String name, String password) {
        return userDao.findByUserNameAndUserPassword(name,password);
    }
}
