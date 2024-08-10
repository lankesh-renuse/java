package core.java.parctice;

public class Swap {
	
	int a =12 ;
	int b =21 ; 
	int temp ;

	void  method ( ) {
	
		temp = a ;
		a = b ;
		b = temp ;
		
		System.out.println(a );
		System.out.println(b    );
		
	}
	
	
	public static void main (String [] args  ) {
	
	Swap s = new Swap();
	s.method();
			
	}	
}
        