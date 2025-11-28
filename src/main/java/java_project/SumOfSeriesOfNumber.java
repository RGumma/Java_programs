package javaprograms;

public class SumOfSeriesOfNumber {

	public static void main(String[] args) {

		int total=0;
		int num=2;
		int term =5;

		for (int i = 0; i < 5; i++) {
            total += num;
            num = num * 10 + 2; // Append another '2'
        }

        System.out.println("The sum is: " + total);
		
		
		
		
		

	}

}
