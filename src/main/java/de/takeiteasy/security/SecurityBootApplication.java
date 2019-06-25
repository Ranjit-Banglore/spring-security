package de.takeiteasy.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "de.takeiteasy.security")
public class SecurityBootApplication {

    public static void main(String args[]){
        SpringApplication.run(SecurityBootApplication.class,args);
    }

}
