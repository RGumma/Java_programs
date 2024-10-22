package java_project;

 class Inner_A {
	 
	 
	 public void showA() {
		 
		 System.out.println("In A show");
	 }
	
	
	class Inner_B{
		
		
	public void showB() {
		
		
		System.out.println("In B show");
	}
		
}
	

 
 
 public static void main(String [] args) {
	 
	 Inner_A a = new Inner_A();
	 //a.showA();
	 
	 Inner_A.Inner_B b= a.new Inner_B();
	 
	  b.showB();
	 
 }
 
 
 }
