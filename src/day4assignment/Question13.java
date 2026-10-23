package day4assignment;
//13. Count the Frequency of Elements Write a program to count the frequency of each element in an array. 
//Example Input: {1, 2, 2, 3, 3, 3} 
//Expected Output 1: 1 2: 2: 3: 3

public class Question13 {

	public static void main(String[] args) {
		int arr[]={1, 2, 2, 3, 3, 3};
		
		boolean visited[] = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			
			if (visited[i]) {
				continue; 
				}
			
			int count=0;
			
			for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				visited[j] = true;
			}
		}
			System.out.println(arr[i]+":"+count);
	}
		

	}

}
