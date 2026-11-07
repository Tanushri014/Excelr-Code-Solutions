package day6assignment;

abstract class Animal {

	//abstract method
	abstract void eat();
	
	//static method
	static void type() {
		System.out.println("Mammle");
	}
	
	//concrete method
	public void sound() {
		System.out.println("Barks");
	}
	
	Animal(){
		System.out.println("I am constructor of abstract class");
	}
	
}
