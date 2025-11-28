package test;

public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCard();
        Payment wallet = new DigitalWallet();

        creditCard.pay(300);
        wallet.pay(300);
    }
}
