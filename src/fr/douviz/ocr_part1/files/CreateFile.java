package fr.douviz.ocr_part1.files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		/********** Creating File *********/
		try {
			File myFile = new File("C:\\Users\\p077535\\OneDrive - Alliance\\sandBox\\JAVA\\testFile.txt");
			if (myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}

	}

}
