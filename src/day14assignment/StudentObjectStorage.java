package day14assignment;

import java.util.ArrayList;
import java.util.List;

public class StudentObjectStorage {

	public static void main(String[] args) {
		List<Student> st=new ArrayList<>();
		Student s1=new Student(1,"radha",98.70);
		Student s2=new Student(2,"raman",98.50);
		Student s3=new Student(3,"manik",98.30);
		st.add(s3);
		st.add(s2);
		st.add(s1);
		//override the toStirngMethod
		System.out.println("Before Sorting:");
		System.out.println(st);
		//descending
		st.sort((a,b)->Double.compare(b.getMarks(), a.getMarks()));
		//ascending
//		st.sort((a,b)->Double.compare(a.getMarks(), b.getMarks()));
		System.out.println("After Sorting:");
		System.out.println(st);
		

	}

}
