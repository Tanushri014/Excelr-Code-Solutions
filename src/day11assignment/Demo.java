package day11assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>(Arrays.asList(10,20,29,37,34));
		li.stream().filter(n->n%2==0).forEach(System.out::println);
		

	}

}
