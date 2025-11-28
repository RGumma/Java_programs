package javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepetativeCharacter {

	public static void main(String[] args) {

		String str = "Java Concept of the day";

		String st = str.replaceAll("\\s+", "");

		System.out.println(st);

		Map<Character, Integer> m = new LinkedHashMap<>();

		char ch[] = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			m.put(ch[i], m.getOrDefault(ch[i], 0) + 1);

		}

		System.out.println(m);

		for (Map.Entry<Character, Integer> entry : m.entrySet()) {

			char key = entry.getKey();

			int value = entry.getValue();

			if (value > 1) {

				System.out.println(entry.getKey());
				
				break;
			}
		}

	}

}
