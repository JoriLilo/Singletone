package leksione;

public  abstract  class Animal {
    String name;
    int age;
    public void printSomething(){
        System.out.println("hey print sth");
    }
    public abstract Integer getAge(int age);
    public abstract void makeNoise();
    public abstract  void sleep();
    public abstract void eat();




}

