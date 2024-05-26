package leksione;

public class Dog extends Animal{
   @Deprecated
    public void makeNoise(){
        System.out.println("dog is making noise");
    }
    @Override
    public void sleep(){
        System.out.println("dog is sleeping");
    }
    @Override
    public void eat(){
        System.out.println("dog is eating");
    }
    @Override  //na thot qe mos ta modifikoj  metoden
    public Integer getAge(int age){
        return age;
    }



}
