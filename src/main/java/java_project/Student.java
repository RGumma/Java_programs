package java_project;

public class Student {

	int m1 = 50;
	int m2 = 60;

	public void addMarks() {
		int m3 = m1 + m2;

		System.out.println(m3);

		
	}
	  class School {         //inner class can be made as static 

		public void displaySchool() {

			System.out.println("He belongs to Mooneyham");
		}
	}

	public static void main(String[] args) {

		Student s = new Student();
		Student.School sc = s.new School();
		
		sc.displaySchool();

	}

}
