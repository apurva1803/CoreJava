package in.co.rays.constructor;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ram", "Indore");
		
		System.out.println("p1 name: " + p1.getName());
		System.out.println("p1 address: " + p1.getAddress());
		
		System.out.println("....................");
		
		Person p2 = new Person("Shyam", "Bhopal");
		
		System.out.println("p2 name: " + p2.getName());
		System.out.println("p2 address: " + p2.getAddress());
		
		
	}
}
