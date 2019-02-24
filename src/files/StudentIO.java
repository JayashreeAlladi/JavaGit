package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import basis.Student;

public class StudentIO {
  public static void main(String[] args) {
	  Student student=new Student();
	  student.setName("jaya");
	  student.setRoll(5);
	  student.setFees(1000);
	  try {
	  FileOutputStream fileOutputStream=new FileOutputStream("D:\\Programs\\Studentdetails1.txt");
	  ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
	  
	  objectOutputStream.writeObject(student);
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
