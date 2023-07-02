package com.example.UserManagementProjectGeekster;

import com.example.UserManagementProjectGeekster.UserManagementProject.UserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class createObject {
    @Bean("object")
    public UserDetails getUserDetails(){
        return new UserDetails(4356, "I7ACHI", "23-11-2000", "pulkitmittal194@gmail.com", 95273645, "27-6-2023", "04:00 A.M");
    }
}
