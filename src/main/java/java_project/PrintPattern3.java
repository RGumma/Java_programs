package javaprograms;

public class PrintPattern3 {

	public static void main(String[] args) {

		int num = 1;
		int rows = 5;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
        
				System.out.println(num);
				num++;
				
			}
			System.out.println();
		}
	}

}
