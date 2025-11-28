package javaprograms;

public class ReverseEachWord1 {

	public static void main(String[] args) {

		String str = "My name is Jessa";

		String st[] = str.split(" ");

		for (int i = 0; i < st.length; i++) {

			char ch[] = st[i].toCharArray();

			for (int j = ch.length - 1; j >= 0; j--) {

				System.out.println(ch[j]);
			}

		}

	}

}
