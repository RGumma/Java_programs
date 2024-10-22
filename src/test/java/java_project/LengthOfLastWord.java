package java_project;

import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the String");
	    
	     String se = sc.nextLine();
	     
	     String arr[] =se.split(" ");
	     
	     int n = arr.length;

	     System.out.println(arr[n-2].length());
	     
	     
	    
	    
		
		
		
		

	}

}
