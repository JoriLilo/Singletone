package data19;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Mainperson {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        Person john=new Person("john smith",26,Nationality.USA);
        Person maria =new Person("maria juan",24,Nationality.Spain);
        Person mira=new Person("mira xheka",35,Nationality.Albania);

        personList.add(john);
        personList.add(maria);
        personList.add(mira);



        for (Person person : personList){
            System.out.println(person);
        }

    }
}
