package java_project;

import java.util.Scanner;

public class FirstLetterCapatalize {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the String");
	    
	     String se = sc.nextLine();
	     
	     String con = " ";
	     
	        String arr[] = se.split(" ");

           for(int i=0; i<arr.length;i++) {
        	   
        	   
        	 con+= Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1)+" ";
        	   
           }
	
	       System.out.println(con);
	
	
	}

}
