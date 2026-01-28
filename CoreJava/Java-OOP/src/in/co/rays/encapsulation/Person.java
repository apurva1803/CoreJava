package in.co.rays.encapsulation;

import java.time.LocalDate;
import java.util.Date;

public class Person {
	
	private String name;
	private Date dob;
	private String addres;
	public final static int AVG_AGE = 18;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setAddress(String address)
	{
		this.addres = address;
	}
	
	public String getAddress()
	{
		return this.addres;
	}
	
	public void setDate(Date dob)
	{
		this.dob = dob;
	}
	
	public Date getDate()
	{
		return this.dob;
	}
	
	public int getAge(Date dob)
	{
		Date d = new Date();
		
		int age = d.getYear() - dob.getYear();
		
		return age;
	}

}
