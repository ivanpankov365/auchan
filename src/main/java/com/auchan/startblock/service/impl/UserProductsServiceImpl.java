package com.auchan.startblock.service.impl;

import com.auchan.startblock.model.UserProducts;
import com.auchan.startblock.repository.UserProductsRepository;
import com.auchan.startblock.service.UserProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProductsServiceImpl implements UserProductsService {
    @Autowired
    private UserProductsRepository userProductsRepository;

    @Override
    public List<UserProducts> findAll() {
        return userProductsRepository.findAll();
    }

    @Override
    public void setProds(UserProducts userProducts) {
        userProductsRepository.save(userProducts);
    }

    @Override
    public void deleteAll() {
        userProductsRepository.deleteAll();
    }
}
