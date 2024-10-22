package java_project;

import java.util.Scanner;

public class CounttheCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");

		String s = sc.nextLine();

		char ch[] = s.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {

			if (Character.isDigit(ch[i])) {

				count = count + 1;

			}

		}

		System.out.println(count);
	}

}
