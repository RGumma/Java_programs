package javaprograms;

public class DisplayEachSubstring {

	public static void main(String[] args) {

		/*
		 * String str1 = "Emma-is-a-data-scientist";
		 * 
		 * String x[]=str1.split("-");
		 * 
		 * for(int i=0;i<x.length;i++) {
		 * 
		 * System.out.println(x[i]); }
		 */

		String str1 = "Emma25 is Data scientist50 and AI Expert";

		String arr[] = str1.split(" ");

		String regex = ".*[0-9].*";

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].matches(regex)) {

				System.out.println(arr[i]);
			}

		}

	}

}
