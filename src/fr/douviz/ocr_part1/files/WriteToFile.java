package fr.douviz.ocr_part1.files;

import java.io.FileWriter;

public class WriteToFile {

	public static void main(String[] args) {

		try (FileWriter myWriter = new FileWriter("C:\\Users\\p077535\\OneDrive - Alliance\\sandBox\\JAVA\\testFile.txt")){
			myWriter.write("Java is the best language :)");
			System.out.println("Successfuly wrote to the file.");
		} catch (Exception e) {
			System.out.println("An error occurred !");
			e.printStackTrace();
		}
	}
}
