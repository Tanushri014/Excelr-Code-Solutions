package day4assignment;
//2. Find Maximum and Minimum in an Array
//Write a program to find the maximum and minimum values in an array.
//Example Input: {3, 1, 4, 7, 2}
//Expected Output:
//Maximum: 7
//Minimum: 1
public class MaxMin {

	public static void main(String[] args) {
		int arr[]= {3,1,4,7,2};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("Max:"+max);
		System.out.println("Max:"+min);
			

	}

}
