package java_project;

import java.util.Scanner;

public class AllNumbersNotEqual {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2= sc.nextInt();
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();

		if (num1 != num2 && num2 != num3 && num3 != num1) {

			System.out.println(" All are different ");

		} else if (num1 == num2 && num2 == num3 && num3 == num2) {

			System.out.println("All are equal");

		} else {

			System.out.println("Neither all are equal or different");

		}

	}

}