package org.example;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IRepository<Entity, Key> {
    List<Entity> findAll();

    Optional<Entity> findById(final Key id);



    Entity save(final Entity entity);

    void remove(final Entity entity);


}

