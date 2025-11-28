package javaprograms;

import java.util.Arrays;

public class CheckEquality {

	public static void main(String[] args) {

		int arr1[] = { 2, 5, 1, 7, 4 };

		int arr2[] = { 2, 5, 1, 7, 4 };

		System.out.println(Arrays.equals(arr1, arr2));
		
		boolean status = true;
		
		if(arr1.length==arr2.length) {
			
			
			for(int i=0; i<arr1.length;i++) {
				
				if(arr1[i]!=arr2[i]){
					
					
					status= false;
				}
			}
			
		}
		
		
		if(status) {
			
			System.out.println("Two arrays are equal");
		}else {
			
			System.out.println("Two arrays are not equal");
		}
		
		

	}

}
