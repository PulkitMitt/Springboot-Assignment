package com.pulkit.GetApiandMailIntegration;

public class MyObject {

    private String name;
    private int age;


    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

