package excercise24;

public class Basket {

    public  int item;

    public Basket() {
        this.item = 0;
    }

    public void  addToBasket(){
       if (item>=10){
          throw  new BasketFullException("Basket is full");
       }
       item++;
    }

    public void removeFromBasket()throws Exception{
        if(item<=1){
            throw new RuntimeException("basket is empty");
        }
        item--;

    }


    }



