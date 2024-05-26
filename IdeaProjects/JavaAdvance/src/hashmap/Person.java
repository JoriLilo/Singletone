package hashmap;

import data19.Nationality;

import java.util.UUID;

public class Person {


        private String fullname;
        private Integer age;
        private Nationality nationality;
        private UUID id;

        public Person(String fullname, Integer age, Nationality nationality,UUID id) {
            this.fullname = fullname;
            this.age = age;
            this.nationality = nationality;
            this.id=id;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge (Integer age) {
            this.age = age;
        }

        public Nationality getNationality() {
            return nationality;
        }

        public void setNationality(Nationality nationality) {
            this.nationality = nationality;
        }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
        public String toString() {
            return "Person*******{{{{        " + "id=   "+id+
                    "     fullname='" + fullname + '\'' +
                    ",   age=" + age +
                    ",   nationality=" + nationality +
                    '}';
        }



}
