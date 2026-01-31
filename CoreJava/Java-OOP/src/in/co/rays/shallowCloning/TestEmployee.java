package in.co.rays.shallowCloning;

public class TestEmployee 
{
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee(1, "Ameya");
		
		Employee e2 = (Employee) e1.clone();
		
		e2.id = 2;
		e2.name = "Shivam";
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
