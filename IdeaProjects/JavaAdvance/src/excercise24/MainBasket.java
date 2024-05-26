package excercise24;

public class MainBasket {
    public static void main(String[] args) {
            Basket basket=new Basket();
    try {
        for (int i = 0; i < 15; i++) {
        basket.addToBasket();
        System.out.println(basket.item);
        }
    }catch (BasketFullException e){
    System.out.println(e.getMessage());
    }

//    try {
//       for (int i = 0; i < 10; i++) {
//            basket.removeFromBasket();
//            System.out.println(basket.item);
//        }
//    }catch (RuntimeException e){
//        System.out.println(e.getMessage());
//    }





    }
}
