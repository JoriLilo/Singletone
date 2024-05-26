package leksione;

public class MainOuter {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(24, "random");
        outerClass.printRandomVariables();

        OuterClass.innerClass incl=new OuterClass.innerClass(24,"dt");


    }
}
