package com.microservices.demo.runner;

import org.springframework.stereotype.Repository;
import twitter4j.TwitterException;

@Repository
public interface StreamRunner {
    void start() throws TwitterException;
}
