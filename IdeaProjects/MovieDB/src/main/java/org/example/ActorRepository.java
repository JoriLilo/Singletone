package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.criteria.CriteriaUpdate;
import lombok.AllArgsConstructor;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor


public class ActorRepository implements IRepository<Actor, UUID> {


    EntityManager entityManager;


    @Override
    public List<Actor> findAll() {
        return entityManager.createQuery("FROM actors", Actor.class).getResultList();
    }

    @Override
    public Optional<Actor> findById(final UUID id) {
        return Optional.ofNullable
                (entityManager.find(Actor.class,id));
    }

    @Override
    public Actor save(final Actor actor) {
        EntityTransaction transaction=null;
        try{
            transaction=entityManager.getTransaction();
            if(!transaction.isActive()){
                transaction.begin();;
            }
            entityManager.persist(actor);

            transaction.commit();
            return actor;
        }catch (final  Exception e){
            if(transaction!=null){
                transaction.rollback();
            }
            return null;
        }
    }

    @Override
    public void remove(final Actor actor) {
        EntityTransaction transaction=null;
        try{
            transaction=entityManager.getTransaction();
            if(!transaction.isActive()){
                transaction.begin();
            }
            entityManager.remove(actor);
            transaction.commit();
        }catch (final Exception e){
            if (transaction!=null){
                transaction.rollback();
            }
        }

    }
}
