package day10assignment;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(10);
		s.add(80);
		System.out.println(s);

	}

}
