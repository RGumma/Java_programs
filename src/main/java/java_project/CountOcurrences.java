package javaprograms;

public class CountOcurrences {

	public static void main(String[] args) {


		String str ="Hello world";
		
		char ch= 'l';
		
		int count =0;
		
		for(int i=0;i<str.length();i++) {
			
			
			if(str.charAt(i)==ch) {
				
				
				count =count+1;
			}
			
		}
		
		System.out.println(count);
		
		

	}

}
