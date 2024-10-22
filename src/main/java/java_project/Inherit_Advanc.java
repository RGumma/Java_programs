package java_project;

public class Inherit_Advanc extends Inherit_Cal {
	
	
	public int multi(int a , int b) {
		
		
		return a*b;
	}
	
	
	public int div(int a, int b) {
		
		
		return a/b;
	}

	public static void main(String[] args) {
		
		Inherit_Advanc a =new Inherit_Advanc();  
		   int p= a.add(40, 30);
		   int q= a.sub(40, 5);
		   
	int mult_total = a.multi(50, 30); // single level inheritance 
		int div_total = a.div(10,2);		
		
      
   
    
	}

}
