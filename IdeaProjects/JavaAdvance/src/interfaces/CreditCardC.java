package interfaces;

import java.time.LocalDate;

public class CreditCardC {
    private String secretNumber;
    private Integer cvs;
    private int  expiredDate;
    private CardHolder cardHolder1;

    public CardHolder getCardHolder1() {
        return cardHolder1;
    }

    public void setCardHolder1(CardHolder cardHolder1) {
        this.cardHolder1 = cardHolder1;
    }

    public Integer getCvs() {
        return cvs;
    }

    public void setCvs(Integer cvs) {
        this.cvs = cvs;
    }

    public int  getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(int expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber(String secretNumber) {
        this.secretNumber = secretNumber;
    }



}
