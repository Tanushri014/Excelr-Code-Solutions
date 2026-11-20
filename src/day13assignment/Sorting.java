package day13assignment;

public class Sorting {

	public static void main(String[] args) {
		int arr[]= {2,3,6,8,4,2};
		
		//there are many sorting techniques that we can use like bubble sort ,insertion sort ,selection sort .
		//here i have demonstrated using the bubble sort 
		
		//bubble
		System.out.println("Before");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nAfter");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
		
		
		

	}

}
