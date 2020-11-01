package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics= new ArrayList<>(Arrays.asList(new Topic("15258759672","Harry Potter","En"),
                            new Topic("15247140593","赵祎明","cn"),
                             new Topic("15247135869","张慧敏","Inner Mongolia")));

    public List<Topic> getAllTopics(){

        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){

        return topics.stream().filter(t -> t.getId().equals(id) ).findFirst().get();
    }
    public void addTopic(Topic topic){

       topics.add(topic);
        //topicRepository.save(topic);
    }

    public void updateTopic(String id,Topic topic) {
        for(int i=0; i<topics.size();i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic); 
            }
        }
    }
}
