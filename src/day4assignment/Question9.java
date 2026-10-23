package day4assignment;
//9. Rotate an Array
//Write a program to rotate an array by a given number of positions to the left.
//Example Input:
//Array: {1, 2, 3, 4, 5}
//Positions: 2
//Expected Output: {3, 4, 5, 1, 2}
public class Question9 {

	public static void main(String[] args) {
		int arr[]={1, 2, 3, 4, 5};
		int position=2;
		int k=0;
		int arr_temp[]=new int[position];
		
		for(int i=0;i<position;i++) {
			arr_temp[i]=arr[i];
		}
		for(int i=position;i<arr.length;i++) {
			
			arr[k]=arr[i];
			
			k++;
		}
		for(int i=0;i<position;i++) {
			arr[k]=arr_temp[i];
			k++;
		}
		
		for (int i = 0; i < arr.length; i++) 
		{ System.out.print(arr[i]);
		if (i < arr.length - 1) { System.out.print(", ");
		} }
		
		
		
	}

}
