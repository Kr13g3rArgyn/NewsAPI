package kz.krieger.esocial_spring.repository;

import kz.krieger.esocial_spring.entity.NewsSourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsSourceRepository extends JpaRepository<NewsSourceEntity, Long>{
}
