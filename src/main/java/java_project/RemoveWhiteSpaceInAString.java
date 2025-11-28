package javaprograms;

public class RemoveWhiteSpaceInAString {

	public static void main(String[] args) {

		String str = "TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";
		
		
		String st = str.replaceAll("\s+", "");
		
		System.out.println(st);

		String rev = "";

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (!Character.isWhitespace(ch[i])) {

				rev = rev + ch[i];

			}

		}

		System.out.println(rev);

	}

}
