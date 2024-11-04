package java_project;

import java.util.Scanner;

public class CounttheDigits {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		char ch[] = String.valueOf(num1).toCharArray();
		System.out.println(ch.length);
		for (int i = 0; i<ch.length; i++) {
			if (Character.isDigit(ch[i])) {

				count = count + 1;

			}

		}

	
	   System.out.println(count);
	}

}
