package javaprograms;

public class CounttheDigits {

	public static void main(String[] args) {

		int num = 5143;

		int v;

		int count = 0;

		String va = String.valueOf(num);

		for (int i = 0; i < va.length(); i++) {

			v = num % 10;

			num = num / 10;

			count = count + 1;

			

		}

		System.out.println(count);
	}

}
