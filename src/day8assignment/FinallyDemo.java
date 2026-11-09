package day8assignment;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Inside try");
		}
		catch (Exception e) {
            System.out.println(e);
        }
		finally {
			System.out.println("Inside finally ");
		}

	}

}
