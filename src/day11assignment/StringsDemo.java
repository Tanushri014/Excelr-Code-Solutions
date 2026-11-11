package day11assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsDemo {

	public static void main(String[] args) {
		List<String> li=new ArrayList<>(Arrays.asList("radha","mira","tira"));
		li.stream().map(n->n.toUpperCase()).forEach(System.out::println);

	}

}
