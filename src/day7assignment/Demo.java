package day7assignment;

class Dog extends Animal{
	
	Dog(){
		//this calls the parent class 
		super();
		System.out.println("i am dog class constructor ");
	}
}
public class Demo {

	public static void main(String[] args) {
		Dog d=new Dog();
		
	}

}


