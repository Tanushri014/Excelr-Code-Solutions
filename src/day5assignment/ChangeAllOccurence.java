package day5assignment;

public class ChangeAllOccurence {

	public static void main(String[] args) {
		String str="aaabdcbbdc";
		char toChange='b';
		char changeWith='k';
		System.out.println("String before replacement is: "+str);

		//convert string to array
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char temp=arr[i];
			if(temp==toChange) {
				arr[i]=changeWith;
			}
		}
		//convert array back to string
		String result=new String (arr);
		System.out.println("String after replacement is: "+result);
		

	}

}
