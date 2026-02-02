package in.co.rays.exercise;



public class Employee implements Cloneable
{
	public int empId;
	public String empName;
	
	public Address address;
	
	public Employee(int id, String name)
	{
		this.empId = id;
		this.empName = name;
		this.address = new Address("Indore", "Sangli");
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		Employee e = (Employee) super.clone();
		
		e.address = (Address) address.clone();
		
		return e;
	}
	
	@Override
	public String toString() {
		return " id: " + empId + " Name: "+ empName + " Address: "+ address ;
	}
}
