package java_project;

import java.util.Scanner;

public class RevereseSentence {

	public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      
      System.out.println("Enter the string");
      
      String s = sc.nextLine();
      
      String rev = " ";
      
      String arr[] = s.split(" ");
      
      for(int i=arr.length-1;i>=0;i--) {
    	  
    	  rev+=arr[i];
      }
      
		System.out.println(rev);

	}

}
