package interfaces;

public interface CreditCard {
    Integer limit=200;
    Integer limitCharge=400;

    Integer getLimit();

    String getSecretNumber();
    void pay(Double amaunt);
    void  charge(Double amount);
    default  void  printLimit(){
        System.out.println(limitCharge);
    }

}
