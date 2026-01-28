package in.co.rays.basic;

public class NoteCounter {
	public static void main(String[] args) {
		
		int money=6750;
		
		int[] notes = {500,200,100};
		
		for(int i=0; i<notes.length; i++)
		{
			int note= notes[i];
			int count=0;
			count= money/note;
			
			if(count>0)
			{
				System.out.println("Total Notes of "+note+" = "+count);
			}
			money = money % note;
		}
	}

}
