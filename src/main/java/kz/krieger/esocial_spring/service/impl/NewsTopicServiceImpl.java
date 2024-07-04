package kz.krieger.esocial_spring.service.impl;

import kz.krieger.esocial_spring.entity.NewsTopicEntity;
import kz.krieger.esocial_spring.repository.NewsRepository;
import kz.krieger.esocial_spring.repository.NewsTopicRepository;
import kz.krieger.esocial_spring.service.NewsTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsTopicServiceImpl implements NewsTopicService {
    //TODO Implement Exception handling, logging, validation, etc

    private final NewsTopicRepository newsTopicRepository;
    private final NewsRepository newsRepository;

    @Autowired
    public NewsTopicServiceImpl(NewsTopicRepository newsTopicRepository, NewsRepository newsRepository) {
        this.newsTopicRepository = newsTopicRepository;
        this.newsRepository = newsRepository;
    }

    @Override
    public List<NewsTopicEntity> getAllNewsTopics() {
        return newsTopicRepository.findAll();
    }

    @Override
    public Optional<NewsTopicEntity> getNewsTopicById(Long id) {
        //TODO Validation, Exception handling
        return newsTopicRepository.findById(id);
    }

    @Override
    public NewsTopicEntity updateNewsTopicById(Long id, NewsTopicEntity newsTopicEntity) {
        newsTopicRepository.findById(id).ifPresent(newsTopic -> {
            newsTopic.setTopicName(newsTopicEntity.getTopicName());
            newsTopicRepository.save(newsTopic);
        });
        return newsTopicEntity;
    }

    @Override
    public NewsTopicEntity saveNewsTopic(NewsTopicEntity newsTopicEntity) {
        return newsTopicRepository.save(newsTopicEntity);
    }

    @Override
    public void deleteNewsTopicById(Long id) {
        newsTopicRepository.deleteById(id);
    }

    @Override
    public void deleteNewsTopicInNews(Long newsId, Long topicId) {
        newsRepository.findById(newsId).ifPresent(newsEntity -> {
            newsEntity.getTopics().removeIf(newsTopicEntity -> newsTopicEntity.getId().equals(topicId));
            newsRepository.save(newsEntity);
        });
    }
}
