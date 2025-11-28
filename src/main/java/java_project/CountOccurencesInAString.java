package javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurencesInAString {

	public static void main(String[] args) {

		String str = "Rajani";

		Map<Character, Integer> m = new LinkedHashMap<>();

		char ch[] = str.toCharArray();

		/*for (int i = 0; i < ch.length; i++) {

			m.put(ch[i], m.getOrDefault(ch[i], 0) + 1);
		}

		System.out.println(m);*/
		
		
		for(int i=0;i<ch.length;i++) {
			
			if(m.containsKey(ch[i])) {
				
			 m.put(ch[i], m.get(ch[i])+1);
				
			}else {
				m.put(ch[i], 1);
			}
		}

		
		System.out.println(m);
	}

}
