public class DebitCard extends PaymentCard implements IScan{
    private int sortCode;
    private int accountNumber;

    public DebitCard(String cardNumber, int sortCode, int accountNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
        //this.cardNumber = cardNumber;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        //this.expiryDate = expiryDate;
        //this.securityNumber = securityNumber;
    }


    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String scan() {
        return "Payment Complete";
    }
}
