package java_project;

public class PrimeNumber {

	public static void main(String[] args) {
      
		
		int n=7; boolean flag = true;
		
		for(int i=2; i<n/2;i++) {
			
			if(n%i==0) {
				
				flag = false;
			}
		
		}
		
		if(flag) {
			
			System.out.println("Prime no");
		}


	

	}
	
	
}
