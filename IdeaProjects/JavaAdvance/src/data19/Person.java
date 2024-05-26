package data19;

public class Person {

    private String fullname;
    private Integer age;
    private Nationality nationality;

    public Person(String fullname, Integer age, Nationality nationality) {
        this.fullname = fullname;
        this.age = age;
        this.nationality = nationality;
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

    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", nationality=" + nationality +
                '}';
    }
}
