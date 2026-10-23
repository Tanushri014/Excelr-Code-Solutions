package day5assignment;

public class Unique {

	public static void main(String[] args) {
		String s = "programming";
		char arr[] = s.toCharArray();
		System.out.print("Unique characters: ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0; 
			for (int j = 0; j < arr.length; j++) { 
				if (arr[i] == arr[j]) { 
					count++; } } 
			if (count == 1) {
				System.out.print(arr[i] + " "); } 
			}

	}

}
