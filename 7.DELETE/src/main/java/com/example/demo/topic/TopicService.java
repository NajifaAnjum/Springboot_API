package com.example.demo.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring framework", "Spring framework description"),
            new Topic("java", "core java framework", "java framework description"),
            new Topic("javascript", "javascript framework", "javascript framework description")
    ));

    //method that returns the list of topics
    public List<Topic> getAllTopics(){
        return topics;
    }

    //method that returns(gets/shows) a single topic
    public Topic getTopic(String id){
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();           //comparing the id of topic to the id that's passed in. findFirst() to get the first topic element.
    }

    //POST
    public void addTopic(Topic topic) {
        topics.add(topic);
    }
    //PUT method for update
    public void updateTopic(String id, Topic topic) {
       for(int i=0; i<topics.size();i++){                          //for loop to go through the list of topics and find by id
              Topic t = topics.get(i);
              if(t.getId().equals(id)){
                  topics.set(i, topic);
                  return;
              }
       }
    }
    //delete
    public void deleteTopic(String id) {
        topics.removeIf(t ->t.getId().equals(id));
    }
}


