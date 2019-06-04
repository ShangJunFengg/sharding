package com.test.sharding.controller;
import com.test.sharding.entity.UserEntity;
import com.test.sharding.mapper.UserMapper;
import com.test.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public   List<UserEntity>  getUser()
    {
      return userService.getUser();
    }


    @GetMapping("/insert")
    public boolean insertUser(UserEntity user)
    {
        return userService.insertUser(user);
    }



}
