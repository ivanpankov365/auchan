package com.auchan.startblock.service;

import com.auchan.startblock.model.UserProducts;

import java.util.List;

public interface UserProductsService {

    List<UserProducts> findAll();
    void setProds(UserProducts userProducts);
    void deleteAll();
}
