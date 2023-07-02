package com.example.UserManagementProjectGeekster.ControllerClass;

import com.example.UserManagementProjectGeekster.UserManagementProject.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {

    @Autowired
    @Qualifier("object")
    UserDetails user;

    @GetMapping("getDetails")
    public String getDetails(){
        return user.toString();
    }

    @PostMapping("testVariables/{id}")
    public void testPathVariable(@PathVariable int id)
    {
        System.out.println("The number passed is :" + id);
    }

    @DeleteMapping("my/personal/details")
    public void testQueryParams(@RequestParam String name, @RequestParam int age)
    {
        System.out.println("The name and age are :" + name + " and " + age );
    }

    @PutMapping("test/both/{name}")
    public String testBothWays(@PathVariable String name,@RequestParam int age)
    {
        return "The name and age are :" + name + " and " + age;
    }

}
