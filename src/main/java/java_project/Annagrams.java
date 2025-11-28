package javaprograms;

import java.util.Arrays;

public class Annagrams {

	public static void main(String[] args) {


		String st1 = "mother in law";
		
		String st2= "hitler woman";
		
		String s1= st1.replaceAll("\s+", "");
		
		String s2= st2.replaceAll("\\s+", "");
		
		char ch1[]= s1.toCharArray();
		
		char ch2[] = s2.toCharArray();
		
		
		
		Arrays.sort(ch1);
		
		Arrays.sort(ch2);
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		if(Arrays.equals(ch1, ch2)) {
			
			
			System.out.println("Both are anagrams");
		
   
	} else {
		
		System.out.println("Both are not anagrams");
	}

}
	
}
