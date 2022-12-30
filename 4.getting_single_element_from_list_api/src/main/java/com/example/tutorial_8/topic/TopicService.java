package com.example.tutorial_8.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring framework", "Spring framework description"),
                new Topic("java", "core java framework", "java framework description"),
                new Topic("javascript", "javascript framework", "javascript framework description")
    );

    //method that returns the list of topics
    public List<Topic> getAllTopics(){
        return topics;
    }

    //method that returns(gets/shows) a single topic
    public Topic getTopic(String id){
       return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();           //comparing the id of topic to the id that's passed in. findFirst() to get the first topic element.
    }
}
