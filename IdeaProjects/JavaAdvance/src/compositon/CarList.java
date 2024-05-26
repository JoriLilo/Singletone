package compositon;

public enum  CarList {
    MERCEDES(4000D, 200),
    AUDI(3000D,200),
    BMV(2900D,220),
    OPEL(1400D,180);

    private  Integer maxSpeed;
    private double price;

    CarList(double price, Integer maxSpeed) {
        this.price = price;
        this.maxSpeed = maxSpeed;
    }



    public double getPrice() {
        return price;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
