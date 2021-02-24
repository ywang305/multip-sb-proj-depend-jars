package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demobase", "com.example.demo"})
@EnableJpaRepositories(basePackages = {"com.example.demobase"})
public class DemoAppApplication {
    private static Logger log = LoggerFactory.getLogger(DemoAppApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }



    @Bean
    CommandLineRunner values(){
        return args -> {

            log.info(" > The Server IP is: ");
        }; }

}
