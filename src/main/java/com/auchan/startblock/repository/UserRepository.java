package com.auchan.startblock.repository;


import com.auchan.startblock.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "DELETE FROM auchanusers WHERE name = :name",
            nativeQuery = true)
    void delete(String name);
}
