package javaprograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean prime = true;

		int arr[] = { 5, 7 };

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the numbers");

			arr[i] = sc.nextInt();

			if (arr[i] <= 2) {

				prime = false;
			} else {

				for (int j = 2; j < arr[i] / 2; j++) {

					if (arr[i] % j == 0) {

						prime = false;
						break;
					}
				}

			}
		}

		if (prime) {

			System.out.println("It is a prime number");
		} else {

			System.out.println("It is not a prime number");
		}

	}

}
