package java_project;

public class MakeFirstLetterCapital {

	public static void main(String[] args) {

       String word = "this is rajani";
       
       String arr[]= word.split(" ");
       
       String rev="";
       
       for(int i=0; i<arr.length;i++) {
    	   
    	 rev+= Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1)+ " ";
       }
		
       System.out.println(rev);
	}

}
