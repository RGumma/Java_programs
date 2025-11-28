package javaprograms;

public class SumTheDigitsNumber {

	public static void main(String[] args) {

		int num = 7456;

		int total = 0;
		String val = String.valueOf(num);

		for (int i = 0; i < val.length(); i++) {

			int v = num % 10;

			num = num / 10;

			total = total + v;

		}

		System.out.println(total);
	}

}
