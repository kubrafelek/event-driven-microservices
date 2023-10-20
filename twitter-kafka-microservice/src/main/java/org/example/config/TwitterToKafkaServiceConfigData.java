package org.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-kafka-microservice")
public class TwitterToKafkaServiceConfigData {

    private List<String> twitterKeywords;
}
