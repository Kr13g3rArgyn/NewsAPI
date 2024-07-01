package kz.krieger.esocial_spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
public class NewsSourceEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sourceName; //username
    private String password;

    @OneToMany(mappedBy = "source",cascade = CascadeType.ALL)
    private List<NewsEntity> news;
}
