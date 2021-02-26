package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.example")
//@ComponentScan(basePackages = {"com.example.demobase", "com.example.demo"})
//@EnableJpaRepositories(basePackages = {"com.example.demobase"})
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
