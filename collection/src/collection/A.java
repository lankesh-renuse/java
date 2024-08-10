package collection;

import java.util.List;

public class A {
	
	public static void main(String [] args ) {
		B  bb = new  B();
		List<Student> s = bb.m2();
		for(Student x : s ) {
			System.out.println(" _________________");
			System.out.println(x.name);
			System.out.println(x.rollnum);
			System.out.println(x.marks);
			
		}
	}

}
