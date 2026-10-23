package day4assignment;
//6. Merge Two Arrays
//Write a program to merge two arrays into a single array.

//Array 1: {1, 3, 5}
//Array 2: {2, 4, 6}
//Expected Output: {1, 3, 5, 2, 4, 6}
public class Question6 {

	public static void main(String[] args) {
		int arr1[]={1, 3, 5};
		int arr2[]={2, 4, 6};
		int final_len=arr1.length+arr2.length;
		int arr3[]=new int[final_len];
		int k=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[k]=arr1[i];
			k++;
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[k]=arr2[i];
			k++;
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]);
			if(i<arr3.length-1) {
				System.out.print(",");
			}
		}

	}

}
