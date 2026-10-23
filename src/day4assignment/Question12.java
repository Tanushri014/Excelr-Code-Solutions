package day4assignment;
//12. Transpose of a Matrix
//Write a program to find the transpose of a 2D array.
//Example Input:
//CopyEdit
//1 2 3
//4 5 6
//Expected Output:
//CopyEdit
//1 4
//2 5
//3 6
public class Question12 {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6}};
		//transpose of array means turning rows into columns and vice versa
		int transpose[][]=new int[arr[0].length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		for (int i = 0; i < transpose.length; i++) { 
			for (int j = 0; j < transpose[i].length; j++) {
				System.out.print(transpose[i][j] + " "); }
			System.out.println();
			}
	}

}
