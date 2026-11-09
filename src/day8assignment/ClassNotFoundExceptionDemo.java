package day8assignment;

public class ClassNotFoundExceptionDemo {

	public static void main(String[] args) {
		 try {
	            Class.forName("com.example.Student");
	        }
	        catch (ClassNotFoundException e) {
	            System.out.println("Class not found!");
	        }
	}

}
