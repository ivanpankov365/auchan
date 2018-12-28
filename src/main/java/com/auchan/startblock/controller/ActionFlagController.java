package com.auchan.startblock.controller;



import com.auchan.startblock.repository.ActionFlagRepository;
import com.auchan.startblock.model.ActionFlag;
import com.auchan.startblock.service.ActionFlagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*@CrossOrigin(origins = "https://mapchain.000webhostapp.com", maxAge = 3600)*/
@org.springframework.stereotype.Controller
@RequestMapping("/")
public class ActionFlagController {

    @Autowired
    private ActionFlagService actionFlagService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/getIn", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ActionFlag> getIn() {
        return actionFlagService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/setGoTRUE", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    void setGoTRUE() {
        actionFlagService.setGoTRUE();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/setGoFalse", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    void setGoFALSE() {
        actionFlagService.setGoFALSE();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/setInTRUE", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    void setInTRUE() {
        actionFlagService.setInTRUE();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/setInFalse", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    void setInFALSE() {
        actionFlagService.setInFALSE();
    }


}
