package java_project;

public class Inherit_VeryAdv extends Inherit_Advanc {


 public double power(int n1, int n2) {
	 
	 
	 
	 return Math.pow(n1, n2);
 }





	public static void main(String[] args) {

		 Inherit_VeryAdv in = new  Inherit_VeryAdv() ;  // multilevel inheritance 
		 
		int r= in.add(30, 40);                              // java does not support multiple inheritance
		int r1= in.div(49, 7);
		int r2= in.sub(40, 20);                        //   C extends A,B (Not possible)
		int r3= in.multi(20, 5);
		double r4=in.power(5, 2);                       // if same method show() is present in both A and B
														 // ambiguity exists which method to call
		System.out.println(r1 + " "+r2 +" "+ r3+ " "+r4 +" "+r);
		 
		 

	}

}
