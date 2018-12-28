package com.auchan.startblock.service;

import com.auchan.startblock.model.ActionFlag;

import java.util.List;

public interface ActionFlagService {

    List<ActionFlag> findAll();
    void setGoTRUE();
    void setGoFALSE();
    void setInTRUE();
    void setInFALSE();
}
