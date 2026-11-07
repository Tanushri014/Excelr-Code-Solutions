package day6assignment;


class Dog extends Animal{
	public void eat() {
		System.out.println("eating you bitch");
	}
}
public class InheritanceandAbstractionDemo {

	public static void main(String[] args) {
		Dog d=new Dog();
		//constructor will be called 
		
		//static method call
		Animal.type();
		d.sound();
	}

}


