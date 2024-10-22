package java_project;

import java.math.BigDecimal;

public class RemoveTrailingZero {

	public static void main(String[] args) {

	String  num = "123.000";
		 
       BigDecimal bd = new BigDecimal(num);
		
		String result =  bd.stripTrailingZeros().toPlainString();
		 System.out.println(result);
		
		

	}

}
