package javaprograms;

public class RemoveVowels {

	public static void main(String[] args) {


		 String st = "rajani";
	        String name = "";

	        char[] ch = st.toCharArray();

	        for (int i = 0; i < ch.length; i++) {
	            if (!(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')) {
	                name = name + ch[i];
	            }
	        }

	        System.out.println(name);
	    }
	}
