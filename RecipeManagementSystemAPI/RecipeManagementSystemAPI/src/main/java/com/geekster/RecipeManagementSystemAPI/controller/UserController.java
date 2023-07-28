package com.geekster.RecipeManagementSystemAPI.controller;

import com.geekster.RecipeManagementSystemAPI.model.*;
import com.geekster.RecipeManagementSystemAPI.model.dto.SignInInput;
import com.geekster.RecipeManagementSystemAPI.model.dto.SignUpOutput;
import com.geekster.RecipeManagementSystemAPI.service.AuthenticationService;
import com.geekster.RecipeManagementSystemAPI.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;

    //sign up, sign in , sign out a particular Recipe user
    @PostMapping("user/signup")
    public SignUpOutput signUpRecipeUser(@RequestBody User user)
    {

        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn")
    public String sigInRecipeUser(@RequestBody @Valid SignInInput signInInput)
    {
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("user/signOut")
    public String sigOutRecipeUser(String email, String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.signOutUser(email);
        }
        else {
            return "Sign out not allowed for non authenticated user.";
        }

    }

    @PostMapping("recipePost")
    public String createRecipePost(@RequestBody RecipePost post, @RequestParam String email, @RequestParam String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.createRecipePost(post,email);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }

    @DeleteMapping("post")
    public String removeRecipePost(@RequestParam Integer postId, @RequestParam String email, @RequestParam String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.removeRecipePost(postId,email);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }

    //commenting functionalities on recipies

    @PostMapping("comment")
    public String addComment(@RequestBody Comment comment, @RequestParam String commenterEmail, @RequestParam String commenterToken)
    {
        if(authenticationService.authenticate(commenterEmail,commenterToken)) {
            return userService.addComment(comment,commenterEmail);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }

    @DeleteMapping("comment")
    public String removeRecipeComment(@RequestParam Integer commentId, @RequestParam String email, @RequestParam String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.removeRecipeComment(commentId,email);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }
}
