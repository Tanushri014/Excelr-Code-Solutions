package day13assignment;

public class MissingNumber {

	public static void main(String[] args) {
//		8.	Find the Missing Number in an Array. 
		//given a sequence and find the number that is missing in series 
		//the question dosnt specify the starting point .
		
		
		//assumptions
		//the given array is a sorted sequence .
		//consider starting from 1
		//print missing numbers in range where start is 1 and end is last element in array 
		int arr[]= {2,2,4,5,6,8};
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i-1]!=i) {
				System.out.println("Missing is:"+i);
				
			}
			
		}

	}

}
