package java_project;

public class Constructor {
	
	String color;
	
	public Constructor(String color) {
		
	this.color = color;	 //this keyword means current object 
		
	}
	
	
	
	
	public static void main(String[] args) {	
		
	Constructor c = new Constructor("green");  // constructor is called at the time of the object creation 
	                                          // Every time you create an object the constructor is called
												// In constructor you can assign the values
String name =c.color;
	
System.out.println("the " +name + " is a color"); //two types of constructor default constructor and parameterized constructor 
		
	}

}
