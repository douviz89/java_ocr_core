package fr.douviz.ocr_part1.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			File myFile = new File("C:\\Users\\p077535\\OneDrive - Alliance\\sandBox\\JAVA\\testFile.txt");
			Scanner myReader = new Scanner(myFile);

			long startTime = System.currentTimeMillis();

			BufferedReader br = new BufferedReader(new FileReader(myFile));

			String st;
			while ((st = br.readLine()) != null)
				System.out.println(st);

//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println(data);
//			}
			long elapsedTime = System.currentTimeMillis() - startTime;

			System.out.println("time elapsed with scanner reader: " + elapsedTime);
//			myReader.close();
		} catch (

		Exception e) {
			System.out.println("An error occurred !");
			e.printStackTrace();
		}
	}

}
