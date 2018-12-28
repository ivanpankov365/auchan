package com.auchan.startblock.repository;

import com.auchan.startblock.model.ActionFlag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActionFlagRepository extends JpaRepository<ActionFlag, Integer> {

    @Query(value = "SELECT * from actionflag",
            nativeQuery = true)
    List<ActionFlag> select();

    @Query(value = "UPDATE actionflag SET flag = true WHERE name = 'go'",
            nativeQuery = true)
    void setGoTRUE();

    @Query(value = "UPDATE actionflag SET flag = false WHERE name = 'go'",
            nativeQuery = true)
    void setGoFALSE();

    @Query(value = "UPDATE actionflag SET flag = true WHERE name = 'in'",
            nativeQuery = true)
    void setInTRUE();

    @Query(value = "UPDATE actionflag SET flag = false WHERE name = 'in'",
            nativeQuery = true)
    void setInFALSE();
}
