package java_project;

@FunctionalInterface
public interface Deo1 {

	void displayname();

}

class Deo1 {

	public static void main(String[] args) {

		Demo1 p = new Demo1() {

			public void displayname() {

				System.out.println("Rajani");
			}

		};

		p.displayname();

	}

}
