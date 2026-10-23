package day5assignment;

public class ReplaceMethod {

	public static void main(String[] args) {
		String s="javaon123naina0";
		System.out.println(s.replace('a', 'o'));
		System.out.println(s.replace("on", "xy"));
		
		
		System.out.println(s.replaceAll("[0-9]", ""));
	}

}
