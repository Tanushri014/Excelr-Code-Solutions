package day12assignment;

import java.util.Optional;

public class MethodsExample {

	public static void main(String[] args) {
		Optional <String> name=Optional.of("java");
//		Optional <String> name2=Optional.of(null);//nullpointerexception
		System.out.println(name);
//		System.out.println(name2);
		
		Optional <String> name3=Optional.ofNullable(null);
		Optional <String> name4=Optional.of("java");
		System.out.println(name3);
		System.out.println(name4);
		
		Optional <String> name5=Optional.empty();
		
		System.out.println(name5);
	}

}
