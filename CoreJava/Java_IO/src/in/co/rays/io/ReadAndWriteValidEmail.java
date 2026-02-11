package in.co.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteValidEmail {
	public static void main(String[] args) throws Exception {

		FileReader source = new FileReader("/Users/apurvaraut/Desktop/CoreJava/email.txt");
		FileWriter target = new FileWriter("/Users/apurvaraut/Desktop/CoreJava/validEmail.txt");

		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(target);

		String email = br.readLine();

		while (email != null) {

			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
				bw.write(email);
				bw.newLine();
			}
			email = br.readLine();
		}

		br.close();
		bw.close();

	}
}
