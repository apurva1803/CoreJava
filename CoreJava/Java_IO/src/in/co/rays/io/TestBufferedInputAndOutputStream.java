package in.co.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedInputAndOutputStream {
	public static void main(String[] args) throws IOException {

		String source = "/Users/apurvaraut/Desktop/CoreJava/krishna.png";

		String target = "/Users/apurvaraut/Desktop/CoreJava/krishna2.png";

		BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));

		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(target));

		int count = in.read();

		System.out.println(count);

		while (count != -1) {

			out.write(count);

			count = in.read();

		}
		System.out.println("sucessfully");
		in.close();
		out.close();

	}
}
