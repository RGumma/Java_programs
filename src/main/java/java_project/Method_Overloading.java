package java_project;

public class Method_Overloading {
	
	static int c;
	
	public int add(int a, int b) {
		
		
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		
		return a+b+c;
	}
	
	
	public double add(double a, int b) {
		
		return a+b;
	}

	public static void main(String[] args) {

		Method_Overloading m = new Method_Overloading();
	     
		c=m.add(20, 30);
		
		System.out.println(c);
		

	}

}
