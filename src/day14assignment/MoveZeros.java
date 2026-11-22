package day14assignment;

public class MoveZeros {

	public static void main(String[] args) {
		int arr[]= {1,0,5,3,6,0};
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[k]=arr[i];
				k++;
			}

		}
		for(int i=k;i<arr.length;i++) {
			arr[i]=0;
		}
		for(int num:arr) {
			System.out.print(num +" ");
		}
		
	}
}
