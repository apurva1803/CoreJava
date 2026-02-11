package in.co.rays.io;

import java.io.FileWriter;

public class WriteTextFile {
	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("/Users/apurvaraut/Desktop/CoreJava/HelloRays.txt", true);

		file.write(" Hello Rays");

		System.out.println("text data write successfully");

		file.close();

	}
}
