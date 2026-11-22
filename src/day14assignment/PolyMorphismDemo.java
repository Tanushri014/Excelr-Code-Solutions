package day14assignment;

public class PolyMorphismDemo {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.career();
		Parent p1=new Child();
		p1.career();
	}

}
