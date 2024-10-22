package java_project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HeightofThreeNumbers {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the numbers");
		
		int [] arr = {2,4,5,1,3};
		
		boolean hasduplicates = false;
		
		Set<Integer> s = new HashSet<>();
		
		for(int a :arr) {
			
			if(!s.add(a)) {
				
				hasduplicates = true;
				break;
			}
			
			
		}

		if(hasduplicates) {
			
			System.out.println("duplicates are there");
		}else {
			
			System.out.println("no duplicates");
		}
		

	}
	
}