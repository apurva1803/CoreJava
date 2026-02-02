package in.co.rays.exercise;


public class Department implements Cloneable
{
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee(1,"Ameya");
		
		Employee e2 = (Employee) e1.clone();
		
		e2.empId = 2;
		e2.empName = "Shivam";
		e2.address = new Address("Sangli","Mumbai");
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
