package day5assignment;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str="diwdj aoksa           aiskjqoaz";
		System.out.println("Without predefined methods:");
		
		//convert into character array
		char arr[]=str.toCharArray();
		
		//tracker
		int k=0;
		
		//check each character 
		for(int i=0;i<arr.length;i++) {
			
			
			//check ifthat char is space skip it 
			if(arr[i]==' ') {
				continue;
				
			}
			arr[k]=arr[i];
			k++;
			
		}
		
		//use only valid characters two build string 
		String result=new String(arr,0,k);
		System.out.println(result);
	}

}
