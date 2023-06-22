package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {
    String name = "Pulkit";
    @Autowired
    Car c ;         // Example of Dependency Injection

    @GetMapping("name")
    public String getName() {
        return this.name;
    }
    @PutMapping("names")
    public String changeName(){
        name = "Pulkit Mittal";
        return name;
    }

}
