package basis;

public class Bank {
  int accNo;
  int balance;
  
  Bank(){
	  System.out.println("constructor called");
	
  }
  public Bank(int i,int j)
  {
	  accNo=i;
	  balance=j;
	  System.out.println("accNo"+ " "+ "balance");
  }
  public static void main(String[] args) {
	 Bank b1=new Bank();
	 Bank b2=new Bank(55,63);// this values not stored in memory after execution, they are in garbage
	 Bank b3=new Bank();//if you again give b1 as reference over here it will show an duplicate error
  }
}
