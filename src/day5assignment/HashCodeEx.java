package day5assignment;

public class HashCodeEx {

	public static void main(String[] args) {
		String s1 = "Java"; String s2 = new String("Java");
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());

	}

}
