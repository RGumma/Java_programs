package java_project;

public class Implementing_Interface_B implements Interface_A {  
	
	
	public void show() {

      System.out.println("in show");
		
	}
	@Override
	public void play() {
		
		System.out.println("in play");
		
	}

	
	
	public static void main(String[] args) {

		Interface_A a  = new Implementing_Interface_B();
		
		a.play();
		a.show();
		int r=Interface_A.num;
		
		System.out.println(r);
		
	}
}
