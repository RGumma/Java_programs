package javaprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str = "programming";

		Set<Character> s = new HashSet<>();

		char ch[] = str.toCharArray();

		/*
		 * for(int i=0;i<ch.length;i++) {
		 * 
		 * for(int j=i+1;j<ch.length;j++) {
		 * 
		 * if(ch[i]==ch[j]) {
		 * 
		 * 
		 * s.add(ch[j]); } }
		 * 
		 * }
		 * 
		 * System.out.println(s);
		 */

		Map<Character, Integer> m = new LinkedHashMap<>();

		for (int i = 0; i < ch.length; i++) {

			m.put(ch[i], m.getOrDefault(ch[i], 0) + 1);

		}

		System.out.println(m);

		char k = '\u0000';

		for (Map.Entry<Character, Integer> ent : m.entrySet()) {

			char key = ent.getKey();
			int value = ent.getValue();

			if (value > 1) {

				k = ent.getKey();
				System.out.println(k);
			}
		}

	}

}
