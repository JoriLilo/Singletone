package interfaces;

import java.util.Random;

public class PayPal implements CreditCard{

    @Override
    public Integer getLimit() {
        return null;
    }

    @Override
    public String getSecretNumber() {

        return null;
    }

    @Override
    public void pay(Double amaunt) {

    }
    private Double balance=0D;

    @Override
    public void charge(Double amount) {
        if(limitCharge >= amount){
            System.out.println("charge u krye me sukses");
            balance+=amount;
        }else {
            System.out.println("nuk u krye");
        }


    }
}