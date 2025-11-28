package javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicates {

	public static void main(String[] args) {

		String st = "Better Butter";

		String s = st.replaceAll("\\s+", "");

		char str[] = s.toCharArray();

		Map<Character, Integer> m = new LinkedHashMap<>();

		for (int i = 0; i < str.length; i++) {

			if (m.containsKey(str[i])) {

				m.put(str[i], m.get(str[i]) + 1);

			} else {

				m.put(str[i], 1);

			}
		}

		System.out.println(m);

		int max = Integer.MIN_VALUE;

		for (Map.Entry<Character, Integer> en : m.entrySet()) {

			char c = en.getKey();

			int value = en.getValue();

			if (value > max) {

				max = value;

			}

		}

		
		System.out.println(max);
	}

}
