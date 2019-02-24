package CollectionEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import basis.Student;
public class StudentCollection {
	static int count=1;
    public static void main(String[] args) {
    	ArrayList<Student> sa=new ArrayList<>();
        sa.add(getInfo());
        sa.add(getInfo());
        System.out.println(sa);
        try {
      	  FileOutputStream fileOutputStream=new FileOutputStream("D:\\Programs\\Studentdetails1.txt");
      	  ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
      	  
      	  objectOutputStream.writeObject(sa);
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

	private static Student getInfo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details of student"+count);
		Student student=new Student();
		student.setName(sc.nextLine());
		student.setRoll(sc.nextInt());
		student.setFees(sc.nextDouble());
		count++;
		return null;
	}
}
