package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        List<Topic> result = new ArrayList<>();
        Topic t1 = new Topic("15258759672","Harry Potter","De");
        Topic t2 = new Topic("15247140593","赵祎明","cn");
        Topic t3 = new Topic("15247135869","张慧敏","Inner Mongolia");
        result.add(t1);
        result.add(t2);
        result.add(t3);
        return result;
    }
}
