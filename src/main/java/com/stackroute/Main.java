package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Modifier;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "com.stackroute")


public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

//        Actor actor1 = context.getBean(Actor.class);
//        actor1.setName("saurav");
//        actor1.setAge(20);


        Movie movie = context.getBean(Movie.class);

        movie.getInfo();


    }

}
