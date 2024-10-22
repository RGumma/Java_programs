package java_project;

import java.util.Scanner;

public class NumbersIncreasingOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int n1 = sc.nextInt();

		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		System.out.println("Enter the third number");
		int n3 = sc.nextInt();

		if (n1 > n2 &&n2 > n3 ) {

			System.out.println("Decresing order");

		} else if (n1 < n2 && n2 < n3) {

			System.out.println("Increasing order");

		} else {

			System.out.println("Neither increasing nor decreasing");

		}

	}

}
