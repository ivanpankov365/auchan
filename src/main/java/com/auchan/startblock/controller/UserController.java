package com.auchan.startblock.controller;

import com.auchan.startblock.model.Friend;
import com.auchan.startblock.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private FriendService friendService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Friend> find() {
        return friendService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/set", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    void set(@RequestBody Friend friend) {
        friendService.setUser(friend);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/deleteAll", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    void deleteAll() {
        friendService.deleteAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    void delete(@RequestBody Friend friend) {
        friendService.deleteUser(friend);
    }
}
