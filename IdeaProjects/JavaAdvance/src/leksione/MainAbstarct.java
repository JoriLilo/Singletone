package leksione;

public class MainAbstarct {
    public static void main(String[] args){
        Animal dog=new Dog();
        dog.eat();
        dog.makeNoise();
        dog.sleep();

        System.out.println();
        System.out.println("new animal");
        System.out.println();

        Animal cat=new Cat();
        cat.makeNoise();
        cat.eat();
        cat.sleep();
    }
}
