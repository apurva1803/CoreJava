package in.co.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile 
{
	public static void main(String[] args) throws IOException {
		
		// read single character only as int
			FileReader file = new FileReader("/Users/apurvaraut/Desktop/CoreJava/Hello.txt");
			
			int i = file.read();
			
			while(i!= -1)
			{
				System.out.println((char)i + "=" + i);
				i = file.read();
			}
			
			file.close();
	}
}

