package kz.krieger.esocial_spring.service;

import kz.krieger.esocial_spring.entity.NewsSourceEntity;

import java.util.List;
import java.util.Optional;

public interface NewsSourceService {
    List<NewsSourceEntity> getAllNewsSources();
    Optional<NewsSourceEntity> getNewsSourceById(Long id);
    NewsSourceEntity saveNewsSource(NewsSourceEntity newsSourceEntity);
    NewsSourceEntity updateNewsSourceById(Long id, NewsSourceEntity newsSourceEntity);
    void deleteNewsSourceById(Long id);
}
