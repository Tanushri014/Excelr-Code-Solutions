package day14assignment;

public class PaymentDemo {

    public static void main(String[] args) {

        Payment p;

        p = new UPIPayment();
        p.pay(5000);

        p = new CreditCardPayment();
        p.pay(10000);

       
    }
}