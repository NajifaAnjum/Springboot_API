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
}
