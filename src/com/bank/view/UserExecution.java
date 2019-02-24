package com.bank.view;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import com.bank.model.User;

public class UserExecution {
	static int count=1;
	public static void main(String[] args) {
    	ArrayList<User> u=new ArrayList<>();
        u.add(getInfo());
        u.add(getInfo());
        try {
        	  FileOutputStream fileOutputStream=new FileOutputStream("D:\\Programs\\Userdetails.txt");
        	  ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        	  
        	  objectOutputStream.writeObject(u);
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
	
	private static User getInfo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details of user"+count);
		User user=new User();
		user.setFname(sc.nextLine());
		user.setLname(sc.nextLine());
		user.setAadharCardNo(sc.nextLong());
		user.setAccountNo(sc.nextLong());
		user.setAccountType(sc.nextLine());
		user.setPancardNo(sc.next());
		user.setPhoneNo(sc.nextLong());
		user.setAddress(sc.nextLine());
		count++;
		return null;
	}
}