package com.example.UserManagementProjectGeekster;

import com.example.UserManagementProjectGeekster.MyObjects.Car;
import com.example.UserManagementProjectGeekster.MyObjects.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ExternalPackage"})
public class BeanCreation {

    @Bean("blue")
    public Car getCarObject1(){
        System.out.println("Blue Car Object created...");
        return new Car("blue");
    }
    @Bean("red")
    public Car getCarObject2(){
        System.out.println("Red Car Object created...");
        return new Car("red");
    }

    @Bean("stu")
    public Student getStu(){
//        System.out.println("Red Car Object created...");
        return new Student();
    }

}
