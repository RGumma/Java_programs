package java_project;

public class Abstract_Honda extends Abstract_car {

 public void drive(){
	
	
	System.out.println("Car can drive");
}


public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Abstract_car c = new Abstract_Honda();
	
	 c.drive();
	 c.play();
	
	

	}

}
