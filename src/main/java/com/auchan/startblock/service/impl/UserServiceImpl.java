package com.auchan.startblock.service.impl;

import com.auchan.startblock.model.User;
import com.auchan.startblock.repository.UserRepository;
import com.auchan.startblock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void setUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user.getName());
    }
}
