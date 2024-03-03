package org.example;

import jakarta.persistence.EntityManager;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.Instant;
import java.util.Date;

public class movieMain {
    public static void main(String[] args) {
        try( SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Movie.class)
                .buildSessionFactory()) {

            EntityManager entityManager=sessionFactory.createEntityManager();
        Movie movie= new Movie();
        movie.setTitle("test");
        movie.setLanguage("albanian");
        movie.setCreatedAt(Date.from(Instant.now()));

        entityManager.getTransaction().begin();
        try {
            entityManager.persist(movie);
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
        }

        entityManager.getTransaction().commit();
    }catch (Exception e){

        System.out.println(e.getMessage());
    }





}
}
