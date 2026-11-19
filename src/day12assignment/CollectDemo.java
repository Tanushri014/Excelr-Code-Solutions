package day12assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {

	public static void main(String[] args) {
List <Integer> li=new ArrayList<>(Arrays.asList(1,2,3,4,6,4,5));
		//map is used to perform the operation on each element .
		List <Integer> result=li.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(result);

	}

}
