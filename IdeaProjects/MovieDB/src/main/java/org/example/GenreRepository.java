package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.criteria.CriteriaUpdate;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class GenreRepository implements IRepository<Genres, UUID> {

    private final EntityManager entityManager;
    public GenreRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Genres> findAll() {
        return entityManager.createQuery("FROM  genres", Genres.class).getResultList();
    }



    @Override
    public Optional<Genres> findById(final UUID id) {
        return Optional.ofNullable(entityManager.find(Genres.class,id));
    }

    @Override
    public Genres save(final Genres genres) {
       EntityTransaction transaction=null;
        try{
            transaction=entityManager.getTransaction();
            if(!transaction.isActive()){
                transaction.begin();;
            }
            entityManager.persist(genres);
            transaction.commit();
            return genres;
        }catch (final  Exception e){
            if(transaction!=null){
                transaction.rollback();
            }
            return null;
        }
    }

    @Override
    public void remove(final Genres genres) {
    EntityTransaction transaction=null;
    try{
        transaction=entityManager.getTransaction();
        if(!transaction.isActive()){
            transaction.begin();
        }
        entityManager.remove(genres);
        transaction.commit();
    }catch (final Exception e){
        if (transaction!=null){
            transaction.rollback();
        }
    }
    }
}
