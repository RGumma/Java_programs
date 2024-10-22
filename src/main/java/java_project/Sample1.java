package java_project;

public class Sample1 {
	
	int c;
	
	int d;
	
	public int multiply(int c, int d) {
		
		
		return c*d;
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		Sample1 s1 = new Sample1();
		
		int add_total=s.add(25,35);
		
		System.out.println("the addition of two number" + add_total);
		
		int sub_total=s.sub(50, 30);
		
		System.out.println("the subtraction of two numbers" +sub_total);
		
		int mult_total= s1.multiply(20, 30);
		
		System.out.println("the multiplication of two numbers" +mult_total);
		
		


	}

}