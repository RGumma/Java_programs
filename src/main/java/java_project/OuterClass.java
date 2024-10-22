package java_project;

public class OuterClass {
private int outerVariable = 10;

	    class InnerClass {
	        public void printOuterVariable() {
	            System.out.println("Outer variable: " + outerVariable);
	        }
	    }

	    public static void main(String[] args) {
	        OuterClass outer = new OuterClass();
	        OuterClass.InnerClass inner = outer.new InnerClass();
	        inner.printOuterVariable();
	    }
	}
	
	
	
	


