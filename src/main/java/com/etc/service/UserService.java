package com.etc.service;

import com.etc.entity.User;

public interface UserService {
    public User findByNameAndPassword(String name,String password);
}
