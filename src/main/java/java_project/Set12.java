package java_project;

import java.util.HashSet;
import java.util.Set;

public class Set12 {

	public static void main(String[] args) {
   
		Set<Integer> num = new HashSet<>();
		
		num.add(3);
		num.add(4);
		num.add(10);
		num.add(1);
		num.add(7);//does not allow duplicates //sequential order
	
		System.out.println(num);
		
				

		
	}

}
