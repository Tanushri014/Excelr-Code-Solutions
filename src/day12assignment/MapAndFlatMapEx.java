package day12assignment;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class MapAndFlatMapEx {

	public static void main(String[] args) {
		List <Integer> li=new ArrayList<>(Arrays.asList(1,2,3,4,6,4,5));
		
		
		
		//map is used to perform the operation on each element .
		List <Integer> squared_li=li.stream().map((n)->n*n).toList();
		System.out.println(squared_li);
		
		//Flatmap is used to perform the operation on each element .
				List <Integer> squared_li2=li.stream().flatMap(n->Arrays.asList(n,n*2).stream()).toList();
				System.out.println(squared_li2);

	}

}
