package interfaces;

public class MainVehicle {


    public static void main(String[] args){
        Bus bus=new Bus();
        bus.start();
        bus.changeGear(3);
        bus.speedUp(30);
        bus.applyBreaks(10);
        System.out.println();
        System.out.println();
        Truck truck= new Truck();
        truck.start();
        truck.changeGear(2);
        truck.speedUp(50);
        truck.applyBreaks(20);
    }
}
