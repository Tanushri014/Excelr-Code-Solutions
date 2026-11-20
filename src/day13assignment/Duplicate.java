package day13assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		String str="Midkdnwidjowdwoj";
		//approach one.
		Set<Character>st=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			if(st.add(str.charAt(i))) {
				continue;
			}
			else {
				System.out.println("Duplicate found:"+str.charAt(i));
			}
		}
		//approach 2
		//count the frequency of each element and store char and count in map.
		//print all the  characters having count greater than the 1 
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
		}
		System.out.println("Using map approach");
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			 System.out.println("Duplicate found: " + entry.getKey()
             + " Count: " + entry.getValue());
		}
		
	}

}
