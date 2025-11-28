package javaprograms;

public class PrintCommanCharactersInAlphabetical {

	public static void main(String[] args) {

		int[] arrayOne = {2, 5, 1, 7,4};
        
        int[] arrayTwo = {2, 5, 1, 7, 4};
        
        boolean equal = false;
        
        
        	if(arrayOne.length==arrayTwo.length) {
        	for(int i=0;i<arrayOne.length;i++) {
        		
        		if(arrayOne[i]==arrayTwo[i]) {
        			
        			equal=true;
        			
        			
        		}
        	}
        
        	}else {
        		
        		equal=false;
        	}
        	
        	
		
		if(equal) {
			
			System.out.println("Both arrays are equal");
		}else {
			
			System.out.println("Both arrays are not equal");
		}
		
		
		
		
		

	}

}
