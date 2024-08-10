package collection;

import java.util.ArrayList;
import java.util.List;

public class B {
	
	C cc = new C () ;
	List<Student> m2 (){
		List<Student> n = new ArrayList<>();
		List <Student> b = C.m1();
		for(Student x: b) {
			if (x.marks >= 50) {
				n.add(x);
			}
			
		}
		return b;
	}
}
