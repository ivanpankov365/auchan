package com.auchan.startblock.service;

import com.auchan.startblock.model.Friend;

import java.util.List;

public interface FriendService {

    List<Friend> findAll();
    void setUser(Friend friend);
    void deleteAll();
    void deleteUser(Friend friend);
}
