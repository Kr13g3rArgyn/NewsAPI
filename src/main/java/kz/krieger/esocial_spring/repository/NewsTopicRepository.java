package kz.krieger.esocial_spring.repository;

import kz.krieger.esocial_spring.entity.NewsTopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsTopicRepository extends JpaRepository<NewsTopicEntity, Long>{
}
