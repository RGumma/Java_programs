package java_project;

public class HeightofTopThree {

	public static void main(String[] args) {

          int num[] = {19,25, 45, 18, 23,24,19};
          
          int max = num[0];
          
           for(int i=1; i<num.length; i++) {
        	   
        	  if(num[i]>max) {
        		   
        		    max=num[i];
        	   }
           }
          
          
          System.out.println(max);

	}

}
