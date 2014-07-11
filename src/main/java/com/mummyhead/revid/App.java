package com.mummyhead.revid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Chris Stier <john.c.stier@gmail.com>
 */
@ComponentScan
@EnableAutoConfiguration
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
