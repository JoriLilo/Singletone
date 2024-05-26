package hashmap;

import data19.Nationality;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MainPerson {
    public static void main(String[] args) {
        Map<UUID, Person> persons=new HashMap<>();
        Person person1=new Person("irene",19, Nationality.Germany,UUID.randomUUID());
        Person person2= new Person("ana",32,Nationality.Albania,UUID.randomUUID());
        Person person3= new Person("lorik",22,Nationality.Spain,UUID.randomUUID());

        persons.put(person1.getId(),person1);
        persons.put(person2.getId(),person2);
        persons.put(person3.getId(),person3);


        HashMap<UUID,Person> person20=new HashMap<>();
        for(Map.Entry<UUID,Person> personEntry: persons.entrySet()) {
            if (personEntry.getValue().getAge() >= 20) {
                person20.put(personEntry.getKey(), personEntry.getValue());
            }
        } for(Map.Entry<UUID,Person> personEntry: person20.entrySet()) {
            System.out.println(
                    personEntry.getKey() + "  " + personEntry.getValue());
        }





    }
}
