package java_project;

@FunctionalInterface
interface IPerson {

	void displySchoolname();

}

public class Person {

	public static void main(String[] args) {

		IPerson person = new IPerson() {

			@Override
			public void displySchoolname() {
				System.out.println("Howdy");
			}
		};
		
		person.displySchoolname();
	}
}
