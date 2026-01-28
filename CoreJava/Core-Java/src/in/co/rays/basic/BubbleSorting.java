package in.co.rays.basic;

public class BubbleSorting {
	public static void main(String[] args) {
		
		int[] a= {5, 6, 1, 3, 9};
		
		int n=a.length;
		
		for(int i=0; i<n -1; i++)
		{
			for(int j=0; j<n-i -1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

}
