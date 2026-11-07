package day5assignment;

public class ConcatStrings {

	public static void main(String[] args) {
		String str1="FirstStr";
		String str2="SecondStr";
		char arr[]=new char[str1.length()+str2.length()];
		int k=0;
		for(int i=0;i<str1.length();i++) {
			arr[k]=str1.charAt(i);
			k++;
		}
		for(int i=0;i<str2.length();i++) {
			arr[k]=str2.charAt(i);
			k++;
		}
		
		String result=new String(arr);
		System.out.println(result);
		
		

	}

}
