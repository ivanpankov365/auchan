package com.auchan.startblock.repository;

import com.auchan.startblock.model.UserProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProductsRepository extends JpaRepository<UserProducts, Integer> {
}