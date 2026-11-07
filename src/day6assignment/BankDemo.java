package day6assignment;

public class BankDemo {

	public static void main(String[] args) {
		 BankAccount b = new BankAccount();

		    // Setting values using setter methods
		    b.setAccountNmber(123456789);
		    b.setAccountHolder("Tanushri");
		    b.setBalance(50000);

		    // Accessing values using getter methods
		    System.out.println("Account Number: " + b.getAccountNmber());
		    System.out.println("Account Holder: " + b.getAccountHolder());
		    System.out.println("Balance: " + b.getBalance());
	}

}
