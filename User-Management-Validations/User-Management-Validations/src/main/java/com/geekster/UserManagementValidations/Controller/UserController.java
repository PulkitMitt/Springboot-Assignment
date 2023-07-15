package com.geekster.UserManagementValidations.Controller;

import com.geekster.UserManagementValidations.Model.User;
import com.geekster.UserManagementValidations.Service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    // API to get the list of users
    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    // API to add a single user
    @PostMapping("user")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }

    // API to add a List of users
    @PostMapping("users")
    public String addUsers(  @RequestBody @Valid List<User> user){
        return userService.addUsers(user);
    }

    // API to delete a particular user by userId

    @DeleteMapping("user")
    public String removeUser(@RequestParam @Max(100) Integer id){
        return userService.removeUser(id);
    }

    @RequestMapping(value = "user/{id}/email/{emailId}", method = PUT)
    String updateEmail(@PathVariable Integer id, @PathVariable @Email String emailId){
        return userService.updateEmail(id, emailId);
    }
}
