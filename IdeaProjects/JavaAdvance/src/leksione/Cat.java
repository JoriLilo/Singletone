package leksione;

public class Cat extends Animal{

    @Override
    public Integer getAge(int age) {
        return 12;
    }

    @Override
    public void makeNoise() {
        System.out.println("cat is making noise");

    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping");

    }

    @Override
    public void eat() {
        System.out.println("cat is eating");

    }
}
