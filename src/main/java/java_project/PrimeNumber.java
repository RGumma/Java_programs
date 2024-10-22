package java_project;

public class PrimeNumber {
	
	public static void main(String[] args) {
	
	int num = 8;
	boolean status = false;
	for(int i=2; i<num/2;i++) {
		
		if(num%i==0) {
			
		 status = true;
		 break;
		}
	
	}
	
     if(status==false) {
    	 
    	 System.out.println(num +"It is a prime number");
     }else {
    	 
    	 System.out.println(num + "It is not a prime");
     }
	
			
		
	
	}
	
}


