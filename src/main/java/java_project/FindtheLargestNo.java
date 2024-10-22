package java_project;

public class FindtheLargestNo {

	public static void main(String[] args) {
		
		
		int num [] = {5,6,3,2,7};
		
		int max = num[0];
		for(int i=1; i<num.length;i++) {
		 
			if(num[i]>max) {
				
				max=num[i];
			}
		 	
			
		}

	System.out.println("Largest number: " + max);
	
	}

}
