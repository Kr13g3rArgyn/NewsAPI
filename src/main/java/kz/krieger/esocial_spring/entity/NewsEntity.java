package kz.krieger.esocial_spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class NewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name = "news_source_id")
    private NewsSourceEntity source;

    @ManyToMany
    @JoinTable(
            name = "news_topic_id",
            joinColumns = @JoinColumn(name = "news_id"),
            inverseJoinColumns = @JoinColumn(name = "topic_id")
    )
    private List<NewsTopicEntity> topics;
}
