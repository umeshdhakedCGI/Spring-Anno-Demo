package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class Movie {

    @Autowired
    private Actor actor;

    private Actor actor1;


    public Movie(){}

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void getInfo(){

        System.out.println(actor.getName() + " " + actor.getGender() + " " + actor.getAge());

        actor.getInfo();
    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//
//        this.context1 = applicationContext;
//
//        Actor app= context1.getBean(Actor.class);
//        app.setAge(50);
//        System.out.println("lol");
//    }
}
