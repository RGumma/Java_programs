package javaprograms;

public class Palandrome {

	
	
	public static void main(String[] args) {
		
		String name ="rajani";
		
		String rev="";
		
		char ch[]=name.toCharArray();
		
		for(int i=name.length()-1;i>=0;i--) {
			
			
		  rev+=ch[i];
		  
		}
		
		System.out.println(rev);
		
		if(name.equals(rev)) {
			
			System.out.println("it is a palandrome");
		}else {
			
			System.out.println("it is not a palandrome");
		}
		
		

}
	
}
