package com.geekster.UserManagementValidations.Service;

import com.geekster.UserManagementValidations.Model.User;
import com.geekster.UserManagementValidations.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }

    // Business Logic to add a single user in the List
    public String addUser(User user) {
        List<User> allUsers = getAllUsers();
        allUsers.add(user);
        return "user has been added!";
    }

    // Business logic of adding a List of users
    public String addUsers(List<User> user) {
        List<User> allUsers = getAllUsers();
        allUsers.addAll(user);
        return "List of users has been added";
    }

    public String removeUser(Integer id) {
        List<User> userList = getAllUsers();
        for (User user : userList){
            if(user.getUserId().equals(id)){
                userList.remove(user);
                return "user has been removed";
            }
        }
        return "user not found";
    }

    public String updateEmail(Integer id, String emailId) {
        List<User> userList = getAllUsers();
        for (User u : userList){
            if(u.getUserId().equals(id)){
                u.setUserEmail(emailId);
                return "email id has been updated";
            }
        }
        return "id not found";
    }
}
