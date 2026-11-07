package day5assignment;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar {

	public static void main(String[] args) {
		String str="aabbcd";
		char arr[]=str.toCharArray();
		//directly we can hashMap
		Map <Character,Integer> map=new HashMap<>();
		
		for(char ch:arr) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		System.out.println("Solution no 1 using HashMap");
		System.out.println(map);
		
		System.out.println();
		//Solution number 2
		//but  this solution is printing duplicates also .so we gonna keep visited .
		System.out.println("Solution no 2 using visited array");
		boolean visited[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count=0;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			
				System.out.println("Frequency of "+arr[i]+" is: "+count);
			
		}
	}

}
