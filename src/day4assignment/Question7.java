package day4assignment;
//7. Remove Duplicate Elements
//Write a program to remove duplicate elements from an array.
//Example Input: {1, 2, 2, 3, 4, 4, 5}
//Expected Output: {1, 2, 3, 4, 5}
public class Question7 {

	public static void main(String[] args) {
		int arr[]={1, 2, 2, 3, 4, 4, 5};
		int k=1;
	
		for(int i=1;i<arr.length;i++) {
		
				if(arr[i]!=arr[i-1]) {
					arr[k]=arr[i];
					k++;
				
			}
		}
		
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]);
			if(i<k-1) {
				System.out.print(",");
			}
		}
		

	}

}
