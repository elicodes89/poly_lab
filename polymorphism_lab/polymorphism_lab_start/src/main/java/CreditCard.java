public class CreditCard extends PaymentCard implements IScan{
    private String cardNumber;
    private String expiryDate;
    private int securityNumber;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
//        this.cardNumber = cardNumber;
//        this.expiryDate = expiryDate;
//        this.securityNumber = securityNumber;
    }


    public String scan() {
        return "Payment Successful";
    }
}
