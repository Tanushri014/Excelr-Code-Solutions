package day12assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		
		//without intermediate stram .no new stream is returned.
		
		
		List<Integer> li=new ArrayList<>(Arrays.asList(10,20,29,37,34));
		li.stream().filter(n->n%2==0).forEach(System.out::println);
		
		//Without stream
		for(int i=0;i<li.size();i++) {
			if(li.get(i)%2==0) {
				System.out.println(li.get(i));
				
			}
		}
		

	}

}
