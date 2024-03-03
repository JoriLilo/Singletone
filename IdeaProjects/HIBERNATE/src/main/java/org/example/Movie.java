package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")


public class Movie {

    @Id
    @GeneratedValue
    private Long Id;
    @Column(nullable = false)
    private Date CreatedAt;
    @Column(name = "movie_title", nullable = false)
    private  String Title;
    @Column(nullable = false)
    private int Duration; //seconds
    @Column(nullable = false)
    private  int Rating;
    @Column(nullable = false)
    private  String Language;
    @ManyToMany
    private Actorss actorss;


}
