package java_project;

public class ARR {
	
	
	

	public static void main(String[] args) {

         // int arr1[] ={5,6,7}; // single dimensional array // array is an object 
		int arr[] =new int [4];
		                          //multi-dimensional array - int num [] [] = new int [3] [4];
		arr[0]= 5;
		arr[1]=7;
		arr[2]= 6;								//int num =7
		arr[3]=8;
		                                       // Integer num1 = 8;
		                                                           // placing the primitive value in the wrapper object is called boxing
		for(int i=0; i<arr.length;i++) {          //  Integer num1 = new Integer(num) //boxing
			                                      // Integer num1 =num // autoboxing
			
				
			System.out.println(arr[i]);
		}
			

	}

}
