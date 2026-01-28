package in.co.rays.basic;

public class LargestNoIntArray {
	public static void main(String[] args)
	{
		int[] intArr= {23,45,56,78,90,94,56,124,34};
		
		int largestNo= intArr[0];
		
		for(int i=0;i<intArr.length;i++)
		{
			if(intArr[i]>largestNo)
			{
				largestNo=intArr[i];
			}
		}
		System.out.println("Largest Number is: "+largestNo);
		
	}

}
