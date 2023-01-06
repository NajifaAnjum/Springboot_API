package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //method that gets(shows) a single topic
    @RequestMapping("/topics/{id}")                 //{id} is a variable portion(can give any other name("/topics/{foo}"), same name is better,otherwise have to mention the name after @PathVariable("foo")).
    public Topic getTopic(@PathVariable String id){         //@PathVariable is used to tell that "/topics/{id}" this is a path and {id} is a variable. and map this {id} to "String id"
        return topicService.getTopic(id);
    }

    //creating a topic using POST Method
    @RequestMapping(method = RequestMethod.POST, value = "/topics")     //map this method to any request that is POST and on "/topics"
    public void addTopic(@RequestBody Topic topic){                                             //now convert it into a topic instance and add that into the list in TopicService.java
        topicService.addTopic(topic);
    }

}
