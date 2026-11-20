package day14assignment;

import java.util.HashMap;
import java.util.Map;

public class FreqCount {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1,1,2,3,4,5};
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println("Using map approach");
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			 System.out.println("frequency of: " + entry.getKey()
             + " is: " + entry.getValue());
		}

	}

}
