package com.vega.springit;

import com.vega.springit.config.SpringItProperties;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties(SpringItProperties.class)
public class SpringitApplication {

    @Autowired
    private SpringItProperties springItProperties;
    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Welcome to SpringIt Motherfucker!!!");

    }

    @Bean
    CommandLineRunner runner(){

        return args -> {
            System.out.println("Welcome Message is "+springItProperties.getWelcomeMsg());
            System.out.println("This is something we would only do in dev");

            String[] beans = applicationContext.getBeanDefinitionNames();
         /*   Arrays.sort(beans);

            for (String bean: beans)
                System.out.println(bean);*/


        };
    }


}
