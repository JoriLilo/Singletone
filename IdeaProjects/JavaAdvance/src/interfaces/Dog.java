package interfaces;

public class Dog implements AnimalInterface {
    private String name;

    @Override
    public void eat() {
        System.out.println("Dog  is eating.");
    }

    @Override
    public void makeNoise() {
        System.out.println(" Dog is making noise.");
    }

    @Override
    public void sleep() {
        System.out.println(" Dog is sleeping.");
    }

    public String getName(String name) {
        this.name = name;
        return name;

    }
}
