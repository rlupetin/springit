package com.vega.springit;

import com.vega.springit.config.SpringItProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SpringItProperties.class)
public class SpringitApplication {

    @Autowired
    private SpringItProperties springItProperties;
    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Welcome to SpringIt Motherfucker!!!");
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
            System.out.println("Welcome Message is "+springItProperties.getWelcomeMsg());
            System.out.println("Current port is "+ springItProperties.getPortNumber());
        };
    }


}
