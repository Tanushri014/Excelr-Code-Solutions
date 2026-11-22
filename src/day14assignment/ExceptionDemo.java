package day14assignment;

public class ExceptionDemo {

	public static void main(String[] args){
		try {
			String name =null;
			 if (name == null) {
	                throw new PagalHaiKyaBhai("Name cannot be null!");
	            }
			System.out.println(name);
		}
		catch(PagalHaiKyaBhai e)  {
			System.out.println(e.getMessage());
		}
		
		

	}

}
