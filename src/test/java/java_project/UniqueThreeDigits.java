package java_project;

public class UniqueThreeDigits {

	public static void main(String[] args) {
	
		int count=0; int i=1; int j=1; int k=1;
		for(i=1; i<=4; i++) {
			
			for(j=1; j<=4; j++) {
				
				for(k=1; k<=4; k++) {
					
					if(i!=j&&j!=k&&k!=i) {
						
						count+=1;
					
						System.out.print(i+" " +j+ " "+k);
						
					}
				}
			}
			
		}
		
		System.out.println(count);
	}

}
