package day14assignment;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInSentence {

	public static void main(String[] args) {
		
		String sent="maya is such a a a a sweet girl";
		//space+1
		Map<String,Integer> map=new HashMap<>();
		String arr[]=sent.split(" ");
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println("Using map approach");
		
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			 System.out.println("frequency of: " + entry.getKey()
             + " is: " + entry.getValue());
		}


	}

}
