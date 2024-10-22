package java_project;

public class Str {
	
	
	 // Strings are constant their values cannot be changed after they are created
	 
	
	
	String s = new String("Rajitha");
	
	char data[] = {'a','b','c'};
	
	public static void main(String[] args) {
		
		String name = "rajani";
		
		String name1 ="rajani";
		
		String re=name.replace('j', 'k');
		
		System.out.println(re);// replace old char with new char
		char[] array = name.toCharArray();
		
		
		
		System.out.println(name.substring(2, 5));
		
		System.out.println(name.substring(3));
		
		System.out.println(name.indexOf("aj"));
		
		System.out.println(array[2]);
		
		 String fruits = String.join(" ","Orange", "Apple", "Mango");
		    System.out.println(fruits);
		  
		
		if(name==name1) {
			
			System.out.println("yes");
		}
		
		else {
			
			System.out.println("no");
		}
		
		
		System.out.println(name.equals(name1)); // return true
		
		
		
		System.out.println(name1.compareTo(name1)); // return o because both are equal
		
		String s=name.concat( "kota");
		
		System.out.println(s);
		
		char c=name.charAt(2);// return the char at particular index
		
		System.out.println(c);
		
		
		
		
		
		
		
		
	}

}
