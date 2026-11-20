package day13assignment;


import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesFromArray {

	public static void main(String[] args) {

		//the question does not mention whether the array is sorted or not.
		//it also doensit mention whethere we have to make in place or we are allowed to make new array .
		
//7.	Remove Duplicate Elements from an Array. 
//if array is orted then we woulddirectly use two pointer approach keep a track of that element ,keep skiping till the next non duplicate elements comes and then i ll add in place operation in array .
		//we can also use set and then skip duplicated and create a new array 
		int arr[]= {1,2,2,2,2,6,6,4,};
		//approach 1
		Set<Integer> st=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			
				st.add(arr[i]);
			
		}
		System.out.println(st);
		//approach2
		System.out.println("In-Place Approach");
		int j = 0;

		for (int i = 1; i < arr.length; i++) {

		    if (arr[i] != arr[j]) {
		        j++;
		        arr[j] = arr[i];
		    }
		}

		

		for (int i = 0; i <= j; i++) {
		    System.out.print(arr[i] + " ");
		}

	}

}
