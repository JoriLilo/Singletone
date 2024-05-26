package org.Sda.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestAnimal {

    private Animal animal;

    @Autowired
    public TestAnimal( Animal animal) { // ne rast se nuk ke nje @primary diku duhet te vesh nji @Qualifier

        this.animal = animal;
        System.out.println(animal.sound());

    }
}
