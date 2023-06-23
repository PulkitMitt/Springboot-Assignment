package com.example.UserMnagementSystem.Contrtoller;

import com.example.UserMnagementSystem.UserDetails.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    @Qualifier("Obj")
    User user;

    @GetMapping("userId")
    public Integer getUserId(){
        return user.getUserId();
    }
    @GetMapping("userName")
    public String getUserName(){
        return user.getName();
    }
    @GetMapping("userUserName")
    public String getUserUserName(){
        return user.getUserName();
    }
    @GetMapping("userAddress")
    public String getUserAddress(){
        return user.getAddress();
    }
    @GetMapping("userPhoneNumber")
    public Integer getPhoneNumber(){
        return user.getPhoneNumber();
    }
}
