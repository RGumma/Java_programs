package java_project;

public class Down_B  extends UP_A{
	
	public void show2() {
		
		System.out.println("In show2 ");
	}

	public static void main(String[] args) {

         UP_A obj = (UP_A)new Down_B();
        // obj.show1();
         
         Down_B obj1 = (Down_B) obj;
         
         obj1.show2();
         
         
         

	}

}
