package day4assignment;
//14. Print Leaders in an Array
//Write a program to print all the leader elements in an array.
//Definition: A leader is an element that is greater than all elements to its right.
//Example Input: {16, 17, 4, 3, 5, 2}
//Expected Output: 17, 5, 2

public class Question14 {

	public static void main(String[] args) {
		int arr[]={16, 17, 4, 3, 5, 2};
		int leaders[]=new int [arr.length];
		int k=0;;
		int max=arr[arr.length-1];
		leaders[k++]=max;
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>max) {
				
				leaders[k]=arr[i];
				max=arr[i];
				k++;
			}
		}
		for(int i=0;i<k;i++) {
			System.out.println(leaders[i]);
			
		}
	}

}
