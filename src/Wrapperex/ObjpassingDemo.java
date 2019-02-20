package Wrapperex;

import java.util.Scanner;

import basis.Student;

public class ObjpassingDemo {
	Scanner sc=new Scanner(System.in);
	Student s=new Student();
	
    public static void main(String[] args) {
    	Student s1=new Student();
    	ObjpassingDemo ob=new ObjpassingDemo();
    	s1=ob.accept();
   // here accept will return a student object s and it is stored in another object s1(extra memory)
   //instead of creating extra object we can call accept method in display method so that return s
    	ob.display(s1);
   // the above s1 object is passed to display method. 
    }
     
    private void display(Student s) {
    	System.out.println(s.getName());
    	System.out.println(s.getRoll());
    	System.out.println(s.getFees());
    	
    }
    private Student accept() {
    	System.out.println("enter name");
    	s.setName(sc.next());
    	System.out.println("enter rollno");
    	s.setRoll(sc.nextInt());
    	System.out.println("enter fees");
    	s.setFees(sc.nextDouble());
    	return s;
    }
    
   //without s1 object :-------
   //
}
