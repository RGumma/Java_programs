package java_project;

public class Dynamic_B extends Dynamic_A {
	
      public int add(int a , int b) {
    	  
    	  
    	  return a+b+1;
    	  
    	  
    	  
      }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Dynamic_A obj = new Dynamic_B();
	  
	    int r =obj.add(40,30);
	    
	    System.out.println(r);
	    
	    }

}
