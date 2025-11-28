package javaprograms;

public class SwapCase {

	public static void main(String[] args) {
		
		
		String s = "RaJaNi";
		
		char ch[] = s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			
			
			if(Character.isLowerCase(ch[i])) {
				
				System.out.println(Character.toUpperCase(ch[i]));
			
			}else {
				
				System.out.println(Character.toLowerCase(ch[i]));
				
				
			}
		}

	}

}
