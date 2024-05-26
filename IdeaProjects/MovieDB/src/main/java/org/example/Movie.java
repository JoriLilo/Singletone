package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "movies")
public class Movie extends BaseEntity{

    private  String title;
    private int year_of_release;
    @ManyToOne
    @JoinColumn
    private Genres genres;
    @ManyToMany(mappedBy = "movies")
    private List<Actor> actors;


}
