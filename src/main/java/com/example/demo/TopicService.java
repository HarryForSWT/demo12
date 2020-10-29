package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
       List<Topic> topics= Arrays.asList(new Topic("15258759672","Harry Potter","De"),
                                new Topic("15247140593","赵祎明","cn"),
                                 new Topic("15247135869","张慧敏","Inner Mongolia"));

    public List<Topic> getAllTopics(){
        return topics;
    }
}
