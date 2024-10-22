package java_project;

public class Ann_A {
	
	
	public void A() {
		
		System.out.println("In A show");
	}
	
	public static void main(String[] args) {

		 new Ann_A() {

			public void B() {

				System.out.println("In new  B show");
			}	

		}.B();
		
		
	
	
	
		
	}

}


