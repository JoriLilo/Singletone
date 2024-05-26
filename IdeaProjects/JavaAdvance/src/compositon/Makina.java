package compositon;

public class Makina {
    public static void main(String[] args) {
        System.out.println(CarList.OPEL.getMaxSpeed());
        System.out.println(CarList.MERCEDES.getPrice());



        Double total=0D;
         for (CarList carList:CarList.values()){
             total+= carList.getPrice();
         }
        System.out.println(total);

    }
}
