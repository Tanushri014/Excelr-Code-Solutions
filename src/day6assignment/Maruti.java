
package day6assignment;
class Maruti extends Car{
	Maruti(String name,Double price){
		super(name,price);
	}
	//child class implementation
	@Override
	public void  getDetails() {
		System.out.println("Name is Maruti price is:40000");
	}
	
	
}