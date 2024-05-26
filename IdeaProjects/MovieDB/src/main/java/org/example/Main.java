package org.example;

import jakarta.persistence.EntityManager;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Movie.class)
                .addAnnotatedClass(Genres.class)
                .addAnnotatedClass(Actor.class)
                .buildSessionFactory()){
            EntityManager entityManager = sessionFactory.createEntityManager();

            GenreRepository genreRepository=new GenreRepository(entityManager);
            genreRepository.save(new Genres("Action",null));
            Genres genres= genreRepository.save(new Genres("Comedy",null));
            Genres genres1 = genreRepository.save(new Genres("Romance",null));
            List<Genres> genresList=genreRepository.findAll();
           for (Genres genres_: genresList){
               System.out.println("---------" + genres_);
           }
//            genreRepository.findAll().forEach(System.out::println);

            MovieRepository movieRepository=new MovieRepository(entityManager);
            movieRepository.save(new Movie("Predator",2023, genres,null));
            Movie movie= movieRepository.save(new Movie("Make me believe",2023,genres1,null));
            Movie movie1= movieRepository.save(new Movie("Anyone but you",2023,genres,null));
            List<Movie> movieList =movieRepository.findAll();
            for (Movie movie_: movieList){
                System.out.println("---------" + movie_);
            }

            
      
        }
    }
}