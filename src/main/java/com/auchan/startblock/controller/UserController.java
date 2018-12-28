package com.auchan.startblock.controller;

import com.auchan.startblock.model.User;
import com.auchan.startblock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<User> find() {
        return userService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/set", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    void set(@RequestBody User user) {
        userService.setUser(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/deleteAll", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    void deleteAll() {
        userService.deleteAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    void delete(@RequestBody User user) {
        userService.deleteUser(user);
    }
}
