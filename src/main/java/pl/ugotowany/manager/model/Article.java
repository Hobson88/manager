package pl.ugotowany.manager.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    //nazwa artykułu
    private String name;

    //klucz obcy
    private Enum<FoodUnit> unit;

    //cena kupna produktu
    private Double price;

    // klucz obcy
    private String main_provider;

}
