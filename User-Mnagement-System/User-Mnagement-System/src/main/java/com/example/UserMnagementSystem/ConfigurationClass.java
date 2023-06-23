package com.example.UserMnagementSystem;

import com.example.UserMnagementSystem.UserDetails.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

    @Bean("Obj")
    public User getUserObject(){
        return new User(4563, "Pulkit", "I7ACHI", "New Delhi", 95604567);
    }
}
