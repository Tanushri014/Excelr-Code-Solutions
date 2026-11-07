package day6assignment;

public class CarDemo {

	public static void main(String[] args) {
		 // Driver object created independently
	    Driver d = new Driver("Tanushri");

	    // Driver object passed to Car
	    Car2 c = new Car2(d);

	    c.showDetails();

	}

}
