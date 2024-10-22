package java_project;

public class Method_Overriding_B  extends Method_Overriding_A {

	public  int add(int a , int b) {
		
	return a+b+1;	
		
	
	}
	
	public static void main(String[] args) {
		
		Method_Overriding_B  m =new Method_Overriding_B ();
		
		int r=m.add(5, 6);      
		
		System.out.println(r);

	}

}
