package in.co.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	public static void main(String[] args) throws IOException {

		String source = "/Users/apurvaraut/Desktop/CoreJava/IOTextFiles/krishna.png";

		String target = "/Users/apurvaraut/Desktop/CoreJava/IOTextFiles/krishna1.png";

		FileInputStream in = new FileInputStream(source); // read binary

		FileOutputStream out = new FileOutputStream(target); // write binary

		int i = in.read();

		while (i != -1) {

			System.out.println(i);
			
			out.write(i);

			i = in.read();

		}

		in.close();
		out.close();
		System.out.println("sucessfullyy......");

	}
}
