package java_project;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		   System.out.println("Enter the name");
		   
		   String s = sc.nextLine();
		   
		      String rev = " ";
		   
		     char ch[] =s.toCharArray();
		     
		   for(int i=ch.length-1; i>=0; i--) {
			   
			    
			     rev+=ch[i];
			   
			   }
         
		   System.out.println(rev);
		   
	}

}
