package compositon;

public class MainPC {
    public static void main(String[] args){
        Processor processor= new Processor("INTEL","Corei8");


        Computer computer= new Computer("dell",
                "jtf",
                2019,processor);
        System.out.println(computer);

    }
}
