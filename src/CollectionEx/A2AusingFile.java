package CollectionEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class A2AusingFile {
    public static void main(String[] args) {
    	try {
			FileInputStream fileInputStream=new FileInputStream("D:\\Programs\\A2A.txt");
			ArrayList<Integer> al=new ArrayList<>();
			int i;
			  while((i=fileInputStream.read())!=-1) {
				  StringBuilder sb=new StringBuilder();
				  
			  }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
