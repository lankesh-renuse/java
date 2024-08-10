package polymorphism.practice;

public class Parent {
	
	void display () {
		System.out.println("Parent- display- method");
	}
	
	private void m1() {
		System.out.println("parent m1");
	}
	
	protected void m2() {
		System.out.println("parent m2");
	}
	
	public static void m3() {
		System.out.println("parent m3");
	}
	
}


 class Child extends Parent {
	@Override
	void display () {
		System.out.println(" display- method");
	}
	
	private void m1() {
		System.out.println("m1");
	}
	@Override
	protected void m2() {
		System.out.println("m2");
	}
	
	public  static void m3() {
		System.out.println(" m3");
	}
	
}

 class test {
	 public static void main(String [] args ) {
		 Parent p = new Parent ();
		 p.display();
	// p.m1();
		 p.m2();
		 p.m3();
		 
		 Parent p1 = new Child ();
		 p1.display();
	//	 p1.m1();
		 p1.m2();
		 p1.m3();
	 }
 }