package basis;

import java.io.Serializable;

public class Student implements Serializable{
    private int roll;
    private String name;
    private double fees;
    
    public String  getName() {
    	return name;
    }

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
class Test{
	public static void main(String[] args) {
		 Student s1=new Student();
		 s1.setName("ram");
		 s1.setRoll(12);
		 s1.setFees(1500);
		  
		 System.out.println(s1.getName());
		 System.out.println(s1.getRoll());
		 System.out.println(s1.getFees());
		 
		 Student s2=new Student();
		 s2.setName("ramya");
		 s2.setRoll(1222);
		 s2.setFees(150051);
		  
		 System.out.println(s2.getName());
		 System.out.println(s2.getRoll());
		 System.out.println(s2.getFees());
}

}
