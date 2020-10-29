package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(new Topic("15258759672","Harry Potter","De"),
                                new Topic("15247140593","赵祎明","cn"),
                                 new Topic("15247135869","张慧敏","Inner Mongolia"));
    }
}
