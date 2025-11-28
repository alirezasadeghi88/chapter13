package test;

public class DigitalWallet implements Payment {


    @Override
    public void pay(double amount) {
        System.out.println("پرداخت " + amount + " با کیف پول دیجیتال انجام شد.");
    }
}
