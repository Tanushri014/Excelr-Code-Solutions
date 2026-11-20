package day13assignment;

import java.util.Arrays;

public class StringReversal {

	public static void main(String[] args) {
	String name="raju";
	//convert it into arr;
	System.out.println("Before reversing:"+name);
	
	char arr[]=name.toCharArray();
	int start=0;
	int end=name.length()-1;
	while(start<end) {
		char temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	String result=new String(arr);
	System.out.println("After reversing");
	System.out.println(result);
	}
	

}
