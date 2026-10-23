package day4assignment;
//Advanced Questions 
//11. Matrix Addition Write a program to perform addition of two 2D arrays (matrices). 
//Example Input: Matrix A
// 1 23 4 
//Matrix B: 5 6 7 8
// Expected 
//Output: 6 8 10 12

public class Question11 {

	public static void main(String[] args) {
		int arr1[][]= {{1,2,3,4}};
		int arr2[][]= {{5,6,7,8}};
		int ans[][]=new int[1][4];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				ans[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
		for (int i = 0; i < ans.length; i++) { 
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j] + " "); 
				} System.out.println(); }
		}

	
}
