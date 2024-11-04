package java_project;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		String s="";
		
		char ch[] = String.valueOf(n).toCharArray();
		 System.out.println(ch);
		 
		for(int i=0; i<=ch.length; i++) {
			 
			 
			result= (int)Math.pow(i, 3);
			
			s+=result;
			
			
		 
		 }
		
		System.out.println(s);
		
		
		
		
		
		
		
	}

}
