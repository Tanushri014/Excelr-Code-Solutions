package day7assignment;

public class Child implements Father ,Mother{

	@Override
	//method overriding 
	public void eat() {
		System.out.println("EATING");
		
	}

}
