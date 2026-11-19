package day12assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueElements {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 20, 10,50,80,20,30, 40, 50);
		 System.out.println("unique elements");
		 List<Integer> result =numbers.stream().distinct().sorted().collect(Collectors.toList());
		 System.out.println(result);

	}

}
