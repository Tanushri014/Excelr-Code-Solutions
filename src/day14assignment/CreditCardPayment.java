package day14assignment;

public class CreditCardPayment implements Payment {
	@Override
    public void pay(double amount) {
        System.out.println("Payment made using Credit Card: " + amount);
    }
}
