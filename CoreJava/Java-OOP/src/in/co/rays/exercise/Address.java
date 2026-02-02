package in.co.rays.exercise;

public class Address implements Cloneable
{
	public String permanentAddr;
	
	public String localAddr;
	
	public Address(String permanentAddr , String localAddr)
	{
		this.permanentAddr = permanentAddr;
		this.localAddr = localAddr;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Permanent Address : " + permanentAddr + " Local Address : " + localAddr;
	}
	
}
