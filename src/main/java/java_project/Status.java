package java_project;

public enum Status {
	
	
	Running, Pending, Success, Failed;
	
	
	
	public static void main(String[] args) {
		
		Status s[] = Status.values();
		
		System.out.println(s[0]);
		
		for(Status ss: s) {
			
			System.out.println(ss + " " +ss.ordinal());
		}
		
		
		
	}
	
	

}
