package day4assignment;
//1. Reverse an Array
//Write a program to reverse the elements of an array without using predefined methods.
//Example Input: {1, 2, 3, 4, 5}
//Expected Output: {5, 4, 3, 2, 1}
public class Question1 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
			}
			
		}
		
	}

}
