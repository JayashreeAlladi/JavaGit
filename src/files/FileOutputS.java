package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputS {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
		try {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\Programs\\Demooo.txt");
		System.out.println("enter integer");
    	int n=sc.nextInt();

		fileOutputStream.write(n);
		fileOutputStream.close();
		
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
