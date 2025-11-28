package javaprograms;

public class LinearSearchInArray {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 7, 8, 9 };

		int pos = 0;
		int key = 6;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {

				pos = i;
				break;

			}
		}

		if (pos != -1) {

			System.out.println("Element found at" + pos);

		} else {

			System.out.println("Element not found");
		}

	}

}
