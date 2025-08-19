package com.wipro.FileOps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourcePath = "C:/Users/durga/Downloads/Source.jpg"; // Also valid
		String destPath = "C:/Users/durga/Downloads/Copy.jpg";

        try {
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destPath);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            fis.close();
            fos.close();

            System.out.println("Image copied successfully to: " + destPath);
        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            e.printStackTrace();
        }

	}

}
