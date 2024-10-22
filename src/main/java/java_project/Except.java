package java_project;

public class Except {

	public static void main(String[] args) {
		int num[] = new int[4];
		int a= 8;
		int b=0;
		int c ;
		try {
		c= a/b;
		
		}catch(ArithmeticException e) {
			
			System.out.println("cannot be divided by zero");
			System.out.println("hello");
		}
		 finally {
		System.out.println("Bye");
	   }
	
	

}
	
}
