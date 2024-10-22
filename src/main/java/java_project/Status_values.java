package java_project;

public class Status_values {

	public static void main(String[] args) {

		Enum_Status s = Enum_Status.failed;
		
		System.out.println(s);
		
		Enum_Status	[] ss = Enum_Status.values();
		
		
		for(Enum_Status val : ss) {
			
			
			System.out.println(val+" " +val.ordinal());
			
			
			
		}
		
	  

	}

}
