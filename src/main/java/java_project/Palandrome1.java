package java_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palandrome1 {

	public boolean containOddNumbers(List<Integer> list) {

		for (int num : list) {
			
			if (num % 2 != 0) {

				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

		Palandrome1 p = new Palandrome1();

		List<Integer> li = new ArrayList();

		li.add(2);
		li.add(4);
		li.add(8);
		li.add(6);

		boolean result = p.containOddNumbers(li);
		System.out.println(result);

	}

}
