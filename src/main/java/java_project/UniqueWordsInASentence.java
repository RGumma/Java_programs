package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsInASentence {

	public static void main(String[] args) {

		String sentence = "dog is a simple animal dogs is selfless animal";

		Set<String> se = new HashSet<>();

		String arr[] = sentence.split(" ");

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			se.add(arr[i]);
		}

		System.out.println(se);
		System.out.println(se.size());

	}

}
