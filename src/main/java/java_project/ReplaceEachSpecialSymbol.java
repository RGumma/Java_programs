package javaprograms;

public class ReplaceEachSpecialSymbol {

	public static void main(String[] args) {

		
		  String str1 = "/*Jon is @developer & musician!!";
		 
		  String replace= str1.replaceAll("[!@#\\$%\\^&\\*\\(\\)_\\+\\-=\\[\\]\\{\\}\\|;:'\",.<>?/`~]", "#");
		  
		  System.out.println(replace);
		  
		String replace2= str1.replaceAll("[!@#\\$%\\^&\\*\\(\\)_\\+\\-=\\[\\]\\{\\}\\|;:'\",.<>?/`~]", "");
        
		System.out.println(replace2);
		String str2 = "I am 25 years and 10 months old";

		char ch[] = str2.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (Character.isDigit(ch[i])) {

				System.out.println(ch[i]);

			}
		}

	}

}
