package com.mummyhead.revid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;

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
