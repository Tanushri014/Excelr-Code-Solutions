package day4assignment;
//8. Find Pairs with a Given Sum
//Write a program to find all pairs of elements in an array whose sum equals a target value.
//Array: {1, 2, 3, 4, 5}
//Target Sum: 6
//Expected Output:
//Pairs: (1, 5), (2, 4)
public class Question8 {

	public static void main(String[] args) {
		int arr[]={1, 2, 3, 4, 5};
		int target=6;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum=arr[i]+arr[j];
				if(sum==target) {
					System.out.print("("+arr[i]+","+arr[j]+")");
				}
				
			}
		}

	}

}
