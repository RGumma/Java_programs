package java_project;

 class Super_B extends Super_A{
	
	public Super_B(int a) {
		
		super() ;                   // Every constructor will have super keyword by default
		System.out.println("In B constructor");
	
	}
	
	
	public int sub(int a, int b) {
		
		
		return a-b;
	}


	
         
     public static void main(String[] args) {

	 Super_B c = new Super_B(5);
		
		
   
		
		
	}

}
     
     
	
