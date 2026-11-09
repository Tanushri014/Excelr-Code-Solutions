package day7assignment;

public class Parent {
	public void showDetails() {
	    System.out.println("This is Parent class");
	}
	//method overloading
	public void showDetails(String name) {
	    System.out.println("This is overloaded method:"+name);
	}
}
