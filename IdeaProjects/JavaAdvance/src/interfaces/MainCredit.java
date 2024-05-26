package interfaces;

public class MainCredit {
    public static void main(String[] args) {
        CardHolder cardHolder = new CardHolder();
        cardHolder.setCardHolderName("mary");
        cardHolder.setCardHolderlastName("smith");
        cardHolder.setAge(12);
        System.out.println(cardHolder);

        CreditCardC creditCardC= new CreditCardC();
        creditCardC.setCvs(123);
        creditCardC.setExpiredDate(05);
        creditCardC.setSecretNumber("134s");
        creditCardC.setCardHolder1(cardHolder);
        System.out.println(creditCardC);
    }

}
