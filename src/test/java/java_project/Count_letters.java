package java_project;

import java.util.Scanner;

public class Count_letters {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the String");
    
     String se = sc.nextLine();
     
       char ch[] = se.toCharArray();
       
       int d=0; int s =0; int l =0; int o =0;
       for(int i = 0; i<ch.length;i++) {
    	   
    	   if(Character.isDigit(ch[i])) {
    		 
    		   d=d+1;
    		   
    		 }else if(Character.isWhitespace(ch[i])) {
    			 
    			 s=s+1;
    		 }else if(Character.isLetter(ch[i])) {
    			 
    			 l=l+1;
    		 
    		 }else {
    			 
    			 o=o+1;
    		 }
    	   
    	   }
       
       System.out.println(d+ " "+s+" "+l+ " "+o);
       
       
     
     
     
    
    
		

	}

}
