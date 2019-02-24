package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputSS {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
		try {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\Programs\\Demooo1.txt");
		System.out.println("enter name");
    	String n=sc.next();
 // converting string to byte using getbytes
    	byte[] b=n.getBytes();
   //writes into the file 	
		fileOutputStream.write(b);
	//closes the connection from the file	
		fileOutputStream.close();
		System.out.println("done");
		} 
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
    	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
