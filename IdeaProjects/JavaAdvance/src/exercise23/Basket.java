package exercise23;

public class Basket {
    private int item;

    public Basket(int item) {
        this.item = 0;
    }

    public void addToBasket(){
        try{
            item=10;

        }catch(Exception e){
            System.out.println("basket is full");
            System.out.println(e.getLocalizedMessage());
        }
        this.item=item++;
        System.out.println(item);
    }
    public void removeFromBasket(){
        try {
            item=0;
        }catch(Exception e){
            System.out.println("basket is empty");
            System.out.println(e.getLocalizedMessage());
        }
        this.item=item--;
        System.out.println(item);


    }

}



