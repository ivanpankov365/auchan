package com.auchan.startblock.service.impl;

import com.auchan.startblock.model.Friend;
import com.auchan.startblock.repository.FriendRepository;
import com.auchan.startblock.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {
    @Autowired
    private FriendRepository friendRepository;

    @Override
    public List<Friend> findAll() {
        return friendRepository.findAll();
    }

    @Override
    public void setUser(Friend friend) {
        friendRepository.save(friend);
    }

    @Override
    public void deleteAll() {
        friendRepository.deleteAll();
    }

    @Override
    public void deleteUser(Friend friend) {
        friendRepository.delete(friend.getName());
    }
}
