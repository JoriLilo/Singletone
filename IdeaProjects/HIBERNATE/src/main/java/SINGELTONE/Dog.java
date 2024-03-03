package SINGELTONE;

import java.util.Collections;
import java.util.List;

public class Dog {


        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

    public Dog(String name, String type, Integer age, List<String> toys) {

    }

    private  void withName(String name){
            this.name=name;
        }
        private  void  withType(String type){
            this.type=type;
        }
        private  void withAge(Integer age){
            this.age=age;
        }
        private void withToys(List<String> toys){
            this.toys= (toys);

        }

    public static class Builder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public Builder withName(final String name) {
            this.name = name;
            return this;
        }

        public Builder withType(final String type) {
            this.type = type;
            return this;
        }

        public Builder withName(final Integer age) {
            this.age = age;
            return this;
        }

        public Builder withToys(final List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            return new Dog(name, type, age, toys);
        }

    }
}
