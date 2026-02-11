package in.co.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteValidPhoneNo 
{
	public static void main(String[] args) throws IOException {
		FileReader source = new FileReader("/Users/apurvaraut/Desktop/CoreJava/IOTextFiles/number.txt");
		FileWriter target = new FileWriter("/Users/apurvaraut/Desktop/CoreJava/IOTextFiles/validNumber.txt");
		
		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(target);
		
		String number = br.readLine();
		
		while (number != null) {

			if (number.length()== 10) {
				System.out.println(number);
				bw.write(number);
				bw.newLine();
			}
			number = br.readLine();
		}

		br.close();
		bw.close();
	}
}
