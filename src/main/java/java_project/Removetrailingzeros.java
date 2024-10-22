package java_project;

public class Removetrailingzeros {

	public static void main(String[] args) {

		String num = "538920";
		
		System.out.println(num.charAt(5));
		
		 char ch[] = num.toCharArray();
             
	      for(int i=ch.length-1;i>=0;i--) {
	    	  
	    	  if(ch[i]!='0') {
	    		  
	    		 continue;
	    		  
	    	  }
		  
					
	    	  System.out.println(ch[i]);	
			
		}
		
		
		
		

	}

}
