package pl.ugotowany.manager.model;


import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;

//    private Set<String> food_tags;
    @Type(type="text")
    private String recipe;

    //domyślna gramatura serwowanej porcji
    private int default_serving;

    //klucz
    @ManyToMany
    @JoinTable(
            name = "dish_ingrediens",                                 // nawa tabelki N:M
            joinColumns = @JoinColumn(name = "dish_id"),              // nazwa kolumny 1
            inverseJoinColumns = @JoinColumn(name = "article_id"))    // nazwa kolumny 2
    private Set<Article> ingredients = new HashSet<>();               // list of ingredients in dish
}
