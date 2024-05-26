package interfaces;

public class Truck implements Vehicle{
    private  int gear=0;
    private int speed=0;
    @Override
    public void start() {
        System.out.println("start engine");

    }



    @Override
    public int changeGear(int gear) {
        this.gear=gear;
        return gear;
    }

    @Override
    public void speedUp(int speed) {
        this.speed+=speed;
        System.out.println("speed is: "+ speed);

    }

    @Override
    public void applyBreaks(int decrement) {
        speed-=decrement;
        System.out.println("speed has decreased to: "+ speed);

    }
}
