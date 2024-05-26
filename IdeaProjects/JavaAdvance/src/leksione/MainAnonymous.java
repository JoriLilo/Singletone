package leksione;

public class MainAnonymous {
    public static void main(String[] args){
        Animal bigfoot= new Animal()
        {
            @Override
            public Integer getAge(int age) {
                return age;
            }

            @Override
            public void makeNoise() {
                System.out.println("bigfoot animal makes a lot of noises");

            }

            @Override
            public void sleep() {
                System.out.println("big foot animal never sleeps");

            }

            @Override
            public void eat() {
                System.out.println("big foot animal eats a lot");

            }
        };
        bigfoot.makeNoise();
        bigfoot.eat();
        bigfoot.sleep();
    }
}
