package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Actor setAcor(){
        return new Actor("Aman","Male", 20);
    }

//    @Bean
//    public Actor setAcor1(){
//        return new Actor("Aman1","Male", 20);
//    }

    @Bean
    public Movie setMovie(){
        return new Movie();
    }



}
