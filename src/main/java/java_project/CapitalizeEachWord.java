package javaprograms;

public class CapitalizeEachWord {

	public static void main(String[] args) {

		String st = "the quick brown fox jumps over the lazy dog";

		String str[] = st.split(" ");
		String rev = "";

		for (int i = 0; i < str.length; i++) {

			String word = str[i]; 
			
			rev += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}

		System.out.println(rev);

	}

}
