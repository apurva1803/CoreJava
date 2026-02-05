package in.co.rays.sorting;

public class Marksheet implements Comparable<Marksheet>
{
	private String rollNo;
	private String name;
	private int physics;
	
	public Marksheet(String rollNo, String name, int physics)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.physics = physics;
	}
	
	@Override
	public int compareTo(Marksheet o) {
		if(this.name.equals(o.name))
		{	
			return this.physics - o.physics;
		}else if(this.physics == o.physics)
		{
			return this.rollNo.compareTo(o.rollNo);
		}else
		{
			return this.rollNo.compareTo(o.rollNo);
		}
	}
	
	@Override
	public String toString() {
		return " RollNo: " + rollNo + " Name: " + name + " Physics: " + physics;
	}
}
