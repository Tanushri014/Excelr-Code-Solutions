package day4assignment;
//3. Check for Palindrome Array
//Write a program to check if the elements of an array form a palindrome.
//Example Input: {1, 2, 3, 2, 1}
//Expected Output: The array is a palindrome.
public class Question3 {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 2, 1};
		int start=0;
		int end=arr.length-1;
		boolean flag=true;
		while(start<arr.length/2) {
			if(arr[start]!=arr[end]) {
				flag=false;
				break;
			}
			start++;
			end--;
		}
		if(flag) {
System.out.println(" The array is Palindrome");
		}
		else {
			System.out.println(" The array is Not Palindrome");
		}
		

	}

}
