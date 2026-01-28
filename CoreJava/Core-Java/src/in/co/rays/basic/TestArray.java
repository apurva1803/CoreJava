package in.co.rays.basic;

public class TestArray {
	
	public static void main(String[] args)
	{
		int[] a= {5,10,15,20,25};
		
		System.out.println("Length of array is "+ a.length);
		
		System.out.println(a[0] + " " + a[1]+ " "+ a[2]);
		System.out.println(a[0]+a[1]-a[4]);
		
		System.out.println("....................");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Index "+i+" = "+a[i]+" Value");
			
		}
		
	}

}
