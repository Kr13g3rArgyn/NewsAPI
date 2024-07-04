package kz.krieger.esocial_spring.service;

import kz.krieger.esocial_spring.entity.NewsEntity;

import java.util.List;
import java.util.Optional;


public interface NewsEntityService {
    List<NewsEntity> getAllNews();
    Optional<NewsEntity> getNewsById(Long id);
    NewsEntity saveNews(NewsEntity newsEntity);
    NewsEntity updateNewsById(Long id, NewsEntity newsEntity);
    void deleteNewsById(Long id);
}
