package day6assignment;
public class Student {
	//example of encapsulation.
private String name;
private int age;
public Student() {
	//default values 
	this.name="No_Name";
	this.age=00;
	System.out.println("Default values are being stored.");
	
}
public Student(String name) {
	//No name  is provided 
	this.name=name;
	System.out.println("name"+this.name);
	System.out.println("Only name is provide.");
	
}
public Student(String name,int age) {
	//No name  is provided 
	this.name=name;
	this.age=age;
	System.out.println("name"+this.name);
	System.out.println("age"+this.age);
	System.out.println("ALL VALUES  ARE PROVIDE ");
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
