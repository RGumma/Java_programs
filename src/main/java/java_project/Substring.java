package javaprograms;

public class Substring {

	public static void main(String[] args) {


		String s ="ABCDCDC";
		
		String sub="CDC";
		
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			
			
			if(s.substring(i, 3)=="CDC") {
				
				
				count =count+1;
			}
			
		}
		
		System.out.println(count);
		
	}
	
	
}