package Exceptionex;

public class Custom {
   public static void main(String[] args) {
	   try {
		   throw new CustomerException();
	   }
	  //  catch(Exception e) {
	  //	   
	  // }
	   catch(CustomerException e) {
	  // System.out.println("my customer exception");
   }
}
}
