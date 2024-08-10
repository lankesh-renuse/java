package core.java.practice;

class A {
	
	public void m1() {
		int a =21 ;
		int b =12 ;
	}

}

class B extends A {
	
	public void m1 () {
		int a = 11;
		int b = 22;
	}
}

class C extends B{
		
	public void m1(){
		int a = 31;
		int b = 41;
		
		}
	public void m2() {
		System.out.println("bmvhfh");
	}
}

class E extends C {
	
	public void m1() {
		int a = 77;
		int b = 88;
		
	}
}

public class Test {
	
	public static void main (String [] args ) {		
		E e = new E();
			  
	}
}
