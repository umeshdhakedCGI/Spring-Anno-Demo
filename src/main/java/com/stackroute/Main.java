package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Hello world!
 *
 */
//@Component
//@Configuration
// @ComponentScan(basePackages = "com.stackroute")
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Movie movie = (Movie) context.getBean(Movie.class);

        movie.getInfo();


    }
}
