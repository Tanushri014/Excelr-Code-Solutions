package day5assignment;

public class FirstCharacterUpperCase {

	public static void main(String[] args) {
		String senetence="java is the only lang i know";
		//split method to convert a sentence into array
		String arr[]=senetence.split("\\s+");
		
		for(int i=0;i<arr.length-1;i++) {
			
			String temp=arr[i];
			
			char temp_ch[]=temp.toCharArray();
			
			temp_ch[0]=Character.toUpperCase(temp_ch[0]);
			
			arr[i]=new String(temp_ch);
			
		}
		String result=String.join(" ", arr);
		System.out.println(result);
		

	}

}

//the solution approach is to first break the sentence into words array using split method.
//then take each word and then take first letter of that word.
//use that letter and convert it into uppercase.
//store the modified string back into the  array.
