package polymorphism.practice;

public class B extends A  {
	
	@Override
	public void method1 () {
		System.out.println(a+b);
	}
	
	public static void main (String [] args ) {
		
		B b = new B();
		b.method1(); 
		
	}

}
