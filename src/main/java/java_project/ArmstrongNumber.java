package javaprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int sum = 0;

		int num1 = num;

		String st = String.valueOf(num1);

		for (int i = 0; i < st.length(); i++) {

			int v = num1 % 10;

			num1 = num1 / 10;

			int va = (int) Math.pow(v, st.length());

			sum = sum + va;

		}

		System.out.println(sum);

		if (num == sum) {

			System.out.println("it is a armstrong number");
		} else {

			System.out.println("It is not an armstrong number");
		}

	}

}
