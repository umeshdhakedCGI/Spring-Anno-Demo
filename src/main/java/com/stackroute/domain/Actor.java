package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
    private String name;
    private String gender;
    private int age;

    public Actor(){}

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Value("aman")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("25")
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    @Value("malea")
    public void setGender(String gender) {
        this.gender = gender;
    }




    



}
