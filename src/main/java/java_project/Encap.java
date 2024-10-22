package java_project;

public class Encap {
	
	
	private String name;
	
	private int age;
	
	
	public Encap(){
		
	name ="rajani";
		
	age=39;
	
	System.out.println("I am in a default Constructor");
		
	}
	
	public Encap(String name, int age) {
		
		this.name =name;
		this.age=age;
		
		System.out.println("I am in parametrized constructor");
	}
	
	public String getName() {
		
		
		return name;
	}
	
	

public void setName(String na) {

	name=na;
	
}
	
	
	
	public void setAge(int age) {
		
		this.age=age;  // this means current object
		
	}
	
	public int getAge() {
		
		
		return age;
	}
	
	public static void main(String[] args) {
		
		Encap e = new Encap();
		
		Encap e1 = new Encap("rajitha", 35);
		// e.setAge(39);
	   // e.setName("rajani");
		
	  System.out.println(e.getName()+"  " +e.getAge());
		
	  System.out.println(e1.getName()+"  " +e1.getAge());
		
		
		
		



	}

}
