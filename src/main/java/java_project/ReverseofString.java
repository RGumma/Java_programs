package java_project;

public class ReverseofString {

	public static void main(String[] args) {


		String originalstr = "rajani";
		char ch[] = originalstr.toCharArray();
		
		String rev="";
		
	   for(int i=ch.length-1;i>=0;i--) {
		   
		   rev+=ch[i];
	   }
	
	System.out.println("The reverse of the string :" + rev);
	}

}
