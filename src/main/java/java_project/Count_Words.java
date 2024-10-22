package java_project;

import java.util.HashSet;
import java.util.Set;

public class Count_Words {

	public static void main(String[] args) {
		
		int count =0;
		
		String word = "This is Rajani";
		
		boolean hasduplicates = false;
		char ch[]=word.toCharArray();
		
		Set<Character>s = new HashSet<>();
		
		for(int i=0;i<ch.length;i++) {
			
			if(!s.add(ch[i])) {
				
			  hasduplicates = true;
			  break;
			}
		}
       
		if(hasduplicates) {
			
			System.out.println("Duplicates are there");
		}else {
			
			System.out.println("No duplicates");
		}
	}

}
