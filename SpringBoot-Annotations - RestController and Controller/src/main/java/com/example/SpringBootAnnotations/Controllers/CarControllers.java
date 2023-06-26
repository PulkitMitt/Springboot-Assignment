package com.example.SpringBootAnnotations.Controllers;

import com.example.SpringBootAnnotations.MyObjects.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CarControllers {

    @Autowired
    @Qualifier("red")
    Car c;

    @ResponseBody
    @GetMapping("color")
    public String getCarColor(){
        return c.getColor();
    }
}
