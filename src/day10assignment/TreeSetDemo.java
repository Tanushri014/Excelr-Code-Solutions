package day10assignment;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<>();
		s.add(10);
		s.add(20);
		s.add(10);
		s.add(3);
		System.out.println(s);

	}

}
