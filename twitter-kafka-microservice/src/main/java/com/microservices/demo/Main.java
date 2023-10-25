package com.microservices.demo;

import com.microservices.demo.config.TwitterToKafkaServiceConfigData;
import com.microservices.demo.runner.StreamRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = "com.microservices.demo")
public class Main implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(TwitterToKafkaServiceConfigData.class);

    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

    private final StreamRunner streamRunner;

    public Main(TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData, StreamRunner streamRunner) {
        this.twitterToKafkaServiceConfigData = twitterToKafkaServiceConfigData;
        this.streamRunner = streamRunner;
    }

    public static void main(String[] args) {
       SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("***********App Start************");
        LOGGER.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray(new String[] {})));
        LOGGER.info(twitterToKafkaServiceConfigData.getWelcomeMessage());
        streamRunner.start();
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