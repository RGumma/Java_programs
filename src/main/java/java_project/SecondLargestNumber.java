package javaprograms;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {


		int arr[] = {985, 521, 975, 831, 479, 861};
		int max = arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
			}
		}
		
		
		System.out.println(max);
		
		Arrays.sort(arr);
		
		int n = arr.length;
		
		int largest = arr[n-1];
		
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i= n-2; i>=0;i--) {
			
			if(arr[i]!=largest) {
				
				secondLargest= arr[i];
				break;
			}
			
		}
		
		System.out.println(secondLargest);
		
		
		
		
		
		
		

	}

}
