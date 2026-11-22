package day14assignment;

public class UPIPayment implements Payment{
	  @Override
	    public void pay(double amount) {
	        System.out.println("Payment made using UPI: " + amount);
	    }
}
