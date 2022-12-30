package com.example.tutorial_8.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired                              //it marks as this needs dependency injection
    private TopicService topicService;      //private member variable of TopicService


    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();         //this returns method getAllTopics() from TopicService.java
    }
}
