package java_project;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		String sc = " Rajani ";

		char ch[] = sc.toCharArray();

		String rev = "";

		for (int i = 0; i < ch.length; i++) {
			
			 int asci = (int) ch[i];
			 
			 System.out.println(asci);

			if (!Character.isWhitespace(ch[i])) {

				rev += ch[i];
			}

		}
		System.out.println(rev);
		System.out.println(sc.length());
		System.out.println(rev.length());

	}

}
