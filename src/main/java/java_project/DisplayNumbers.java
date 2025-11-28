package javaprograms;

public class DisplayNumbers {

	public static void main(String[] args) {

		int arr[] = { 12, 75, 150, 180, 145, 525, 50 };

		for (int i = 0; i < arr.length; i++) {

			if(arr[i]>500) {
				
				break;
			}else if (arr[i]>150) {
				
				continue;
			}else if(arr[i]%5==0) {
				
				System.out.println(arr[i]);
			}
		}
	}

}
