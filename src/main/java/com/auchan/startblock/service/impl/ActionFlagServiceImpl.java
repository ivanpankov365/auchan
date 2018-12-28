package com.auchan.startblock.service.impl;

import com.auchan.startblock.model.ActionFlag;
import com.auchan.startblock.repository.ActionFlagRepository;
import com.auchan.startblock.repository.UserRepository;
import com.auchan.startblock.service.ActionFlagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActionFlagServiceImpl implements ActionFlagService{

    @Autowired
    private ActionFlagRepository actionFlagRepository;
    @Override
    public List<ActionFlag> findAll() {
        return actionFlagRepository.findAll();
    }

    @Override
    public void setGoTRUE() {
        actionFlagRepository.setGoTRUE();
    }

    @Override
    public void setGoFALSE() {
        actionFlagRepository.setGoFALSE();
    }

    @Override
    public void setInTRUE() {
        actionFlagRepository.setInTRUE();
    }

    @Override
    public void setInFALSE() {
        actionFlagRepository.setGoFALSE();
    }
}
