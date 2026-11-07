package day5assignment;

import java.util.Arrays;

public class Anagrams {

	//a word or phrase that is made by arranging the letters of another word or phrase in a different order.
	public static void main(String[] args) {
		String str1="Throw";
		String str2="Worth";
		//after  sorting the sequence of strings is same .
		// as we cannot perform the sort method directaly on  the strings .we need to convert then into character array first 
		//then we can sort those arrays 
		//and then compare them .
		char arr1[]=str1.toLowerCase().toCharArray();
		char arr2[]=str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Strings are Anagram");
		}
		else {
			System.out.println("Strings are not  Anagram");
		}
	}

}
