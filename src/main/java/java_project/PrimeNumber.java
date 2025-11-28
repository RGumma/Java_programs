package javaprograms;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 7;

		boolean prime = true;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {

				prime = false;
				break;
			}

		}

		if (prime == true) {

			System.out.println("it is a prime number");
		} else {

			System.out.println("It is not a prime number");
		}

	}

}
