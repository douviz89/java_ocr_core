package fr.propertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws Exception {
		Properties	p = new Properties();
		OutputStream os = new FileOutputStream("IO\\global.properties");
		
		p.setProperty("name", "Douviz");
		p.setProperty("pass", "000");
		p.store(os, "First version of global.properties");
		
		/********* Loading properties files *************/
		InputStream is = new FileInputStream("IO\\global.properties");
		
		p.load(is);
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("pass"));
		
		p.list(System.out);
				
	}

}
