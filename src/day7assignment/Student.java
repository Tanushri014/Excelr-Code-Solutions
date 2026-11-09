package day7assignment;

public class Student {
	private String name;
	private int roll;
	private char grade;
	public Student() {
		this.name="default";
		this.roll=0;
	}
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
		System.out.println("name:"+name+", roll number is:"+roll);
	}
	public Student(String name) {
		super();
		this.name = name;
		System.out.println("name:"+name);
		
	}
	public Student(String name, int roll, char grade) {
		super();
		this.name = name;
		this.roll = roll;
		this.grade = grade;
		System.out.println("name:"+name+", roll number is:"+roll+",grade :"+grade);
	}
	

}
