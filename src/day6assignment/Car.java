package day6assignment;

public class Car {
	private String name;
	private double price;
	public void getDetails() {
		System.out.println("Name is"+name+" price is:"+price);
	}
	
	public Car(String name, double price) {
	
		this.name = name;
		this.price = price;
		System.out.println("parent class constructor");
	}
	

}
