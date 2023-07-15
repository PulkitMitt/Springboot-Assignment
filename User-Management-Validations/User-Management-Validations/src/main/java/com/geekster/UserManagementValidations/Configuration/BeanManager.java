package com.geekster.UserManagementValidations.Configuration;

import com.geekster.UserManagementValidations.Model.Type;
import com.geekster.UserManagementValidations.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<User> getInitializedList(){
        User user = new User(0,"Bitzz", "bitz@geekster.com", "abed", "9898989898", 26, LocalDate.of(1996, 12,12), Type.ADMIN);
        List<User> newList = new ArrayList<>();
        newList.add(user);
        return newList;
    }
}
