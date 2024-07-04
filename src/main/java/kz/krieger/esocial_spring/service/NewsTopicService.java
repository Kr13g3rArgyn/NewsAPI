package kz.krieger.esocial_spring.service;

import kz.krieger.esocial_spring.entity.NewsTopicEntity;

import java.util.List;
import java.util.Optional;

public interface NewsTopicService {
    List<NewsTopicEntity> getAllNewsTopics();
    Optional<NewsTopicEntity> getNewsTopicById(Long id);
    NewsTopicEntity updateNewsTopicById(Long id, NewsTopicEntity newsTopicEntity);
    NewsTopicEntity saveNewsTopic(NewsTopicEntity newsTopicEntity);
    void deleteNewsTopicById(Long id);
    void deleteNewsTopicInNews(Long newsId, Long topicId);

}
