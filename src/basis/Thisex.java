package basis;

public class Thisex {
    int accNo;
    int balance;
    
      Thisex(){
    	  System.out.println("constructor called");
      }
    public Thisex(int accNo, int balance)
    {
    	this();
    	this.accNo=accNo;
    	this.balance=balance;
        System.out.println(accNo+" "+balance);
        new Thisex();
    }
    public static void main(String[] args) {
    	Thisex t=new Thisex(52,100); 
  //when u call this the values are displayed,but they are not stored in memory.they r in garbage.
  //if we want to store we go serialization.
    }
}
