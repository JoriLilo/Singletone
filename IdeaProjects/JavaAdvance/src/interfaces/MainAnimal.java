package interfaces;

public class MainAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName("Mogi");
        System.out.println(dog.getName("mogi"));
        dog.makeNoise();
        dog.eat();
        dog.sleep();



    }
}
