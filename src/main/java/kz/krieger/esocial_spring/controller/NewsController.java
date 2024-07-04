package kz.krieger.esocial_spring.controller;

import kz.krieger.esocial_spring.entity.NewsEntity;
import kz.krieger.esocial_spring.service.NewsEntityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
public class NewsController {
    private final NewsEntityService newsEntityService;

    public NewsController(NewsEntityService newsEntityService) {
        this.newsEntityService = newsEntityService;
    }

   @GetMapping("/news")
   public ResponseEntity<List<NewsEntity>> getNews() {
        List<NewsEntity> newsList = newsEntityService.getAllNews();
        return new ResponseEntity<>(newsList, HttpStatus.OK);
    }
    @GetMapping("/news/{id}")
    private String getNewsById(@PathVariable Long id) {
        return newsEntityService.getNewsById(id).toString();
    }
    @PostMapping("/news/create")
    private ResponseEntity<HttpStatus> createNews(@RequestBody NewsEntity newsEntity, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        newsEntityService.saveNews(newsEntity);
        return null;
    }
}
