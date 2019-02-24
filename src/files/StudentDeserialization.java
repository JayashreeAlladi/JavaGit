package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import basis.Student;

public class StudentDeserialization {
   public static void main(String[] args) {
	   try {
	   FileInputStream fileInputStream=new FileInputStream("D:\\Programs\\Studentdetails1.txt");
	   ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
	   
	   Student s=(Student)objectInputStream.readObject();
	   System.out.println(s.getName()+" "+s.getRoll()+" "+s.getFees());
	   }
	   catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
 	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


   }
}
