package day12assignment;

import java.util.Optional;

public class MethodsEx {

	public static void main(String[] args) {
		 Optional<String> name = Optional.of("Java");

	        System.out.println(name.isPresent());
	        
	        Optional<String> name2 = Optional.of("Java");

	        name2.ifPresent(n -> System.out.println(n));
	        Optional<String> name3 = Optional.empty();

	        String result = name3.orElse("Default Value");

	        System.out.println(result);
	        
	        Optional<String> name4 = Optional.empty();

	        String result2 = name4.orElseGet(() -> "Java Programming");

	        System.out.println(result2);
	        
	        Optional<String> name5 = Optional.empty();

	        String result3 = name5.orElseThrow(
	                () -> new RuntimeException("Value not found")
	        );

	        System.out.println(result3);
	}

}
