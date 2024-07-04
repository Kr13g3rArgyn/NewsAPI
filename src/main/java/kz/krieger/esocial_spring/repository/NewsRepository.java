package kz.krieger.esocial_spring.repository;

import kz.krieger.esocial_spring.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<NewsEntity, Long>{
}
