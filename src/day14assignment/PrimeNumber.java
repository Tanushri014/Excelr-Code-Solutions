package day14assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=1;
		boolean flag=true;
		
		if(number<=1) {
			System.out.println("number less than equal to1 are not prime");
			flag=false;
			
			
		}
		for (int i=2;i<number;i++) {
			
			if(number%i==0) {
				flag=false;
				break;
			}
			
		}
		if(flag){
			System.out.println(number+" is  a prime");
		}
		else{
			System.out.println(number+" is  not a prime");
		}
	

	}

}
