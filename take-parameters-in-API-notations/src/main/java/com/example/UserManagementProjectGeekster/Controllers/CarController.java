package com.example.UserManagementProjectGeekster.Controllers;

import com.example.UserManagementProjectGeekster.MyObjects.Car;
import com.example.UserManagementProjectGeekster.MyObjects.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @Autowired
    @Qualifier ("blue")
    Car c;

    @Autowired
    @Qualifier("stu")
    Student s;

    @GetMapping("color")
    public String getCarColor(){
        return c.getColor();
    }
    @GetMapping("tree")
    public String getSomething(){
        return "Mainak's testing API";
    }
    @GetMapping("test")
    public void testControllerAnnotationiff(){
        System.out.println("Testing api with @Controller tag-different line");
    }

    @PostMapping ("tree")
    public String testControllerAnnotation(){
        return "Testing api with @Controller tag";
    }

    @PostMapping("testVariable/{id}")
    public void testPathVariable(@PathVariable int id){
        System.out.println("The number is:" + id);
    }

    @PostMapping("testVariables/{id1}/mainak/{id2}")
    public String testPathVariables(@PathVariable int id1, @PathVariable String id2)
    {
        return "The number passed is :" + id1 + " and " + id2 ;
    }

    @PostMapping("testVariables/{id1}/{id2}")
    public String testPathVariablessss(@PathVariable int id1, @PathVariable String id2)
    {
        return "The number passed is :" + id1 + " and " + id2 ;
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

    @PutMapping("test/both/{names}")
    public String testBoth(@RequestParam int age ,@PathVariable String names)
    {
        return "The name and age are :" + names + " and " + age;
    }
    @PostMapping("testing/parameters/object")
    public Student printStudent(@RequestBody Student s)
    {
//        System.out.println(s);
        return s; 
    }










}
