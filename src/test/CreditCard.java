package test;

public class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("پرداخت " + amount + " با کارت بانکی انجام شد.");
    }
}
