package kz.krieger.esocial_spring.controller;

import kz.krieger.esocial_spring.entity.NewsTopicEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/topic")
public class NewsTopicController {

    private NewsTopicEntity newsTopicEntity;

    @GetMapping()
    public NewsTopicEntity getNewsTopic() {
        return newsTopicEntity;
    }
}
