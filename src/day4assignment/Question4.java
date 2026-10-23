package day4assignment;
//4. Count Even and Odd Numbers
//Write a program to count the number of even and odd elements in an array.
//Example Input: {1, 2, 3, 4, 5}
//Expected Output:
//Even Numbers: 2
//Odd Numbers: 3
public class Question4 {
	public static void main(String[] args) {
		
		int arr[]={1, 2, 3, 4, 5};
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
				}
			else{
				odd++;
			}
		}
		System.out.println("Even count is:"+even);
		System.out.println("Odd count is:"+odd);
	}

}
