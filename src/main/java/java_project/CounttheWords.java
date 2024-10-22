package java_project;

import java.util.HashMap;
import java.util.Map;

public class CounttheWords {

	public static void main(String[] args) {

		String sc = "This this is is done by Saket Saket";
		
		Map<String, Integer>  m = new HashMap<String, Integer> ();
		
			String arr[] = sc.split(" ");
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
		
			m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
				
	 }
		
		System.out.println(m);
		

	}

}
