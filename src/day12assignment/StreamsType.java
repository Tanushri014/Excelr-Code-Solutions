package day12assignment;

import java.util.Arrays;
import java.util.List;

public class StreamsType {

	public static void main(String[] args) {
		//sequential stream 
		 List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		 System.out.println("Sequential stream");
	        numbers.stream()
	               .forEach(n -> System.out.println(n));
		//parallel stream
	        List<Integer> numbers1 = Arrays.asList(10, 20, 30, 40, 50);
	        System.out.println("Parallel stream");
	        numbers1.parallelStream()
	               .forEach(n -> System.out.println(n));
	}

}
