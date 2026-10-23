package day4assignment;
//10. Find the Missing Number
//Write a program to find the missing number in an array of integers from 1 to n.
//Example Input: {1, 2, 4, 5}
//Expected Output: Missing Number: 3
public class Question10 {

	public static void main(String[] args) {
		int arr[]={1, 2, 4, 5};
		int n=arr.length;
		int k=1;
for(int i=0;i<n;i++) {
	if(arr[i]!=k) {
		System.out.println("Missing Number :"+ k);
		break;
		
	}
	k++;
	
}

	}

}
