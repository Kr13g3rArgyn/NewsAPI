package kz.krieger.esocial_spring.service.impl;

import kz.krieger.esocial_spring.entity.NewsEntity;
import kz.krieger.esocial_spring.repository.NewsRepository;
import kz.krieger.esocial_spring.repository.NewsTopicRepository;
import kz.krieger.esocial_spring.service.NewsEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsEntityServiceImpl  implements NewsEntityService{
    //TODO Implement Exception handling, logging, validation, etc

    private final NewsRepository newsRepository;
    private final NewsTopicRepository newsTopicRepository;

    @Autowired
    public NewsEntityServiceImpl(NewsRepository newsRepository, NewsTopicRepository newsTopicRepository) {
        this.newsRepository = newsRepository;
        this.newsTopicRepository = newsTopicRepository;
    }

    @Override
    public List<NewsEntity> getAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public Optional<NewsEntity> getNewsById(Long id) {
        return newsRepository.findById(id);
    }

    @Override
    public NewsEntity saveNews(NewsEntity newsEntity) {
        return newsRepository.save(newsEntity);
    }

    @Override
    public NewsEntity updateNewsById(Long id, NewsEntity newsEntity) {
        newsRepository.findById(id).ifPresent(news -> {
            news.setTitle(newsEntity.getTitle());
            news.setContent(newsEntity.getContent());
            newsRepository.save(news);
        });
        return newsEntity;
    }

    @Override
    public void deleteNewsById(Long id) {
        newsRepository.deleteById(id);
    }
}
