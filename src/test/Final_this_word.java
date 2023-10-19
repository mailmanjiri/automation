package test;

public class Final_this_word {
	
	final static int e=23; // can create static variable at class level only not inside any method
                           // need to use final word at the initiation time only.
	                      // final e=34 you can't do it here
	
	
	public static void main(String[] args) {
		// how to make a variable final
		final  int a=10;
		
			System.out.println(a);
			
			a1(23);

	}
	  
	public static void a1(int c) {
		final float b=25;
		System.out.println(b);
	
	}
	      
}
