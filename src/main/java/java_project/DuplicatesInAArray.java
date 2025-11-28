package javaprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesInAArray {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 111, 333, 555, 777, 333, 444, 555 };

		/*
		 * Set<Integer>s=new HashSet<>();
		 * 
		 * 
		 * for(int i=0;i<inputArray.length;i++) {
		 * 
		 * 
		 * for(int j=i+1; j<inputArray.length;j++) {
		 * 
		 * 
		 * if(inputArray[i]==inputArray[j]) {
		 * 
		 * 
		 * s.add(inputArray[i]);
		 * 
		 * }
		 * 
		 * } }
		 * 
		 * 
		 * System.out.println(s)
		 */;

		Map<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < inputArray.length; i++) {

			if (m.containsKey(inputArray[i])) {

				m.put(inputArray[i], m.get(inputArray[i]) + 1);

			} else {

				m.put(inputArray[i], 1);

			}

		}

		
		System.out.println(m);
		
		
		for(Map.Entry<Integer, Integer>en: m.entrySet()) {
			
			
			int key = en.getKey();
			
			int value = en.getValue();
			
			if(value>1) {
				
				
				System.out.println(key);
			}
			
			
			
			
			
		}
	}

}
