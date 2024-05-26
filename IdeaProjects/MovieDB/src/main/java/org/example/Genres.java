package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "genres")
@AllArgsConstructor
@NoArgsConstructor

public class Genres extends BaseEntity{


    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "genres")
    private List<Movie> movies;
}
