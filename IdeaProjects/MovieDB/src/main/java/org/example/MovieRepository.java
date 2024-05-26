package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
public class MovieRepository implements IRepository <Movie, UUID> {
    EntityManager entityManager;




    @Override
    public List<Movie> findAll() {
        return  entityManager.createQuery("FROM movies", Movie.class).getResultList();
    }

    @Override
    public Optional<Movie> findById(final UUID id) {
        return Optional.ofNullable
                (entityManager.find(Movie.class,id));
    }

    @Override
    public Movie save(final Movie movie) {
        EntityTransaction transaction=null;
        try{
            transaction=entityManager.getTransaction();
            if(!transaction.isActive()){
                transaction.begin();;
            }
            entityManager.persist(movie);

            transaction.commit();
            return movie;
        }catch (final  Exception e){
            if(transaction!=null){
                transaction.rollback();
            }
            return null;
        }
    }

    @Override
    public void remove(final Movie movie) {
        EntityTransaction transaction=null;
        try{
            transaction=entityManager.getTransaction();
            if(!transaction.isActive()){
                transaction.begin();
            }
            entityManager.remove(movie);
            transaction.commit();
        }catch (final Exception e){
            if (transaction!=null){
                transaction.rollback();
            }
        }

    }
}
