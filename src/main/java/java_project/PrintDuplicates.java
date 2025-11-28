package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,1,2,3};
		Set s = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					s.add(arr[j]);
				}
			}
		}
		
		
		System.out.println(s);
		

	}

}
