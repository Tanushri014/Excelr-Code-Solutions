package day13assignment;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String str1 = "listen";
	    String str2 = "silent";

	    // Convert to lowercase
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();

	    // Check length
	    if (str1.length() != str2.length()) {
	        System.out.println("Not Anagrams");
	        return;
	    }

	    // Convert strings into character arrays
	    char arr1[] = str1.toCharArray();
	    char arr2[] = str2.toCharArray();

	    // Sort both arrays
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);

	    // Compare both arrays
	    if (Arrays.equals(arr1, arr2)) {
	        System.out.println("Anagrams");
	    } else {
	        System.out.println("Not Anagrams");
	}
	}

}
