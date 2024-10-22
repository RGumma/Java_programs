package java_project;

public class Enca1 {

	private String name;
	
	private int age;
	
	
	
	public String getName() {
		
		return name;
	}
	
	
	public void setName(String name) {
		
		this.name=name;
		
	}
	

	public int getAge() {
		
		
		return age;
	}
	
	
	public void setAge(int age) {
		
		this.age= age;
		
	}
	
	public static void main (String[] args) {
		
		Enca1 e = new Enca1();
		
		e.setAge(39);
		
		System.out.println(e.getAge());
		
		
		
	}
	
	
}
