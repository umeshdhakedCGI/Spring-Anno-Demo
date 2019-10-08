package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfig {

    @Bean
    public Actor getAcor(){
        return new Actor("Aman","Male", 20);
    }


    @Bean
    public Movie getMovie(){
        return new Movie();
    }



}
