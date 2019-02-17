package basis;

public class POJO1 {
	private int roll;
    private String name;
    private double fees;
    private String clgname;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	
}
class Mainclass{
	public static void main(String[] args) {
		 POJO1 p1=new POJO1();
		 p1.setName("ram");
		 p1.setRoll(12);
		 p1.setFees(1500);
		p1.setClgname("VJIT");
		 
		 POJO1 p2=new POJO1();
		 p2.setName("raj");
		 p2.setRoll(102);
		 p2.setFees(15100);
		 p2.setClgname("CVSR");
		 
		 POJO1 p3=new POJO1();
		 p3.setName("ramyaj");
		 p3.setRoll(2);
		 p3.setFees(1100);
		 p3.setClgname("anurag"); 
		 
		 System.out.println(p1.getClgname());
		 System.out.println(p2.getClgname());
		 System.out.println(p3.getClgname());
		 
	}
}
