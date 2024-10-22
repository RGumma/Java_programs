package java_project;

public class Palan {

	public static void main(String[] args) {

       int num =123;
       String rev="";
       
        char ch[] = String.valueOf(num).toCharArray();
        
        for(int i=ch.length-1;i>=0;i--) {
        	
        	rev +=ch[i];
        }
       
      System.out.println(rev);
     
        int num1 = Integer.parseInt(rev);
        
        if(num==num1) {
        	
        	System.out.println("Both are equal");
        }else {
        	
        	System.out.println("Both are not equal");
        }
        

}

}