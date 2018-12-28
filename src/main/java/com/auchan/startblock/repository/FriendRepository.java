package com.auchan.startblock.repository;


import com.auchan.startblock.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Integer> {
    @Query(value = "DELETE FROM auchanfriends WHERE name = :name",
            nativeQuery = true)
    void delete(String name);
}
