package com.auchan.startblock.controller;

import com.auchan.startblock.model.UserProducts;
import com.auchan.startblock.service.UserProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserProductsController {
    @Autowired
    private UserProductsService userProductsService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/getProds", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<UserProducts> findAllProds() {
        return userProductsService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/setProd", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    void setProds(@RequestBody UserProducts prod) {
        userProductsService.setProds(prod);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/deleteProds", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    void delete() {
        userProductsService.deleteAll();
    }
}
