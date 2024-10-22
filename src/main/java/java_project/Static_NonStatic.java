package java_project;

public class Static_NonStatic {
	
	
	int a; 
	
	int b;
	
	static int c;
	int d;
	
	static String name;
	
	static 
	{
		
		name="rajani";  // static block is used to initialize the static variables 
		                // static block is called first when the class loads
	}
	
	public static int  add(int a, int b) {
		
	
		
		return a+b;
	}
	
	
	public int sub(int a, int b) {
		
		
		c=20;
		
		return a-b;
	}

	public static void main(String[] args) {
		
		Static_NonStatic.add(20, 30);
		
		


	}

}
