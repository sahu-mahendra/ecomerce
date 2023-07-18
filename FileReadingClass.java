package com.project.first.learing;

import java.io.*;

public class FileReadingClass {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\lenovo\\Desktop\\test.txt");
		 
		FileReader fr = new FileReader(file);
		BufferedReader br= new BufferedReader(new FileReader(file));
		  String str;
	        
	        while ((str = br.readLine()) != null)
	 
	            
	            System.out.println(str);

	}
}