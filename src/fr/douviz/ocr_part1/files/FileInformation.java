package fr.douviz.ocr_part1.files;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		/********** File Informations *********/

		File myFile = new File("C:\\Users\\p077535\\OneDrive - Alliance\\sandBox\\JAVA\\testFile.txt");
		if (myFile.exists()) {
			System.out.println("File name: " + myFile.getName());
			System.out.println("Absolute path: " + myFile.getAbsolutePath());
			System.out.println("Writable: " + myFile.canWrite());
			System.out.println("Readable: " + myFile.canRead());
			System.out.println("File size in bytes: " + myFile.length());
		} else {
			System.out.println("The file does not exists.");
		}
	}

}
