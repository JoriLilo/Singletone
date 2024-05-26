package interfaces;

public class CardHolder {
    private String cardHolderName;
    private String cardHolderlastName;
    private Integer age;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCardHolderlastName() {
        return cardHolderlastName;
    }

    public void setCardHolderlastName(String cardHolderlastName) {
        this.cardHolderlastName = cardHolderlastName;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
}
