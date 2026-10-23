package day5assignment;

public class ReverseString {

	public static void main(String[] args) {
		String str="mad";
		 char arr[]=str.toCharArray();
		 int start = 0;
		 int end = arr.length - 1;
		 while (start < end) { // Swap characters 
			 char temp = arr[start];
			 arr[start] = arr[end];
			 arr[end] = temp;
			 start++; end--; 
			 } String reverse = new String(arr); 
			 System.out.println("Reversed String: " + reverse);
			 
			// Method 2: StringBuilder Method 
			 StringBuilder sb = new StringBuilder(str); 
			 System.out.println("Reverse using StringBuilder: " + sb.reverse());
		 }
}
