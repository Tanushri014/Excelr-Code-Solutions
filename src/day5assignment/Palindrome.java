package day5assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		 char arr[]=str.toCharArray();
		 int start = 0;
		 int end = arr.length - 1;
		 while (start < end) { // Swap characters 
			 char temp = arr[start];
			 arr[start] = arr[end];
			 arr[end] = temp;
			 start++; end--; 
			 } String reverse = new String(arr); 
			 if(str.equals(reverse)) {
				 System.out.println("Palindrome");
			 }
			 else {
				 System.out.println(" Not Palindrome");
			 }
			 

	}

}
