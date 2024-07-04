package kz.krieger.esocial_spring.service.impl;

import kz.krieger.esocial_spring.entity.NewsSourceEntity;
import kz.krieger.esocial_spring.repository.NewsSourceRepository;
import kz.krieger.esocial_spring.service.NewsSourceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsSourceServiceImpl implements NewsSourceService {

    private final NewsSourceRepository newsSourceRepository;

    public NewsSourceServiceImpl(NewsSourceRepository newsSourceRepository) {
        this.newsSourceRepository = newsSourceRepository;
    }

    @Override
    public List<NewsSourceEntity> getAllNewsSources() {
        return newsSourceRepository.findAll();
    }

    @Override
    public Optional<NewsSourceEntity> getNewsSourceById(Long id) {
        return newsSourceRepository.findById(id);
    }

    @Override
    public NewsSourceEntity saveNewsSource(NewsSourceEntity newsSourceEntity) {
        return newsSourceRepository.save(newsSourceEntity);
    }

    @Override
    public NewsSourceEntity updateNewsSourceById(Long id, NewsSourceEntity newsSourceEntity) {
    //TODO Add updating news topics, source
        newsSourceRepository.findById(id).ifPresent(newsSource -> {
            newsSource.setSourceName(newsSourceEntity.getSourceName());
            newsSource.setPassword(newsSourceEntity.getPassword());
            newsSourceRepository.save(newsSource);
        });
        return newsSourceEntity;
    }

    @Override
    public void deleteNewsSourceById(Long id) {

    }
}
