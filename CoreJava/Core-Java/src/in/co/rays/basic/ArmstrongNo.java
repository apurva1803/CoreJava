package in.co.rays.basic;

public class ArmstrongNo {

	public static void main(String[] args) {
		int num = 150;
		int OrgNo = num;
		int res = 0;
		int r = 0;

		while (num != 0) {
			r = num % 10;
			res = res + (r*r*r);
			num= num/10;
			
		}
		
		if(OrgNo== res)
		{
			System.out.println(OrgNo+ " is Armstrong Number");
		}
		else
		{
			System.out.println(OrgNo+ " is Not Armstrong Number");
		}

	}

}
