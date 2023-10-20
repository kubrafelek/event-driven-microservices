package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Main implements CommandLineRunner {

    public static void main(String[] args) {
       SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("***********App Start************");
    }
}

/*
* 1-
*  @Scope("request")
*  @PostConstruct
    public void init(){

    }
*
* 2-
* implements ApplicationListener
* @Override
    public void onApplicationEvent(ApplicationEvent event) {

    }
* */