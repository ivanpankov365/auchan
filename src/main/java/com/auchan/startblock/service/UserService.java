package com.auchan.startblock.service;

import com.auchan.startblock.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    void setUser(User user);
    void deleteAll();
    void deleteUser(User user);
}
