package files;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileInputSS {
   public static void main(String[] args) {
	  try {
		  FileInputStream fileInputStream=new FileInputStream("D:\\Programs\\Demooo1.txt");
		  int i;
		  while((i=fileInputStream.read())!=-1) {
			  System.out.println((char)i);
		  }
		  fileInputStream.close();
	  }
	  catch (FileNotFoundException e) {
		// TODO: handle exception
		  e.printStackTrace();
	   }
	  catch (IOException e) {
			// TODO: handle exception
			  e.printStackTrace();
		   }

   }
}
