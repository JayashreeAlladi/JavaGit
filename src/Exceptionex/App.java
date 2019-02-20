package Exceptionex;

public class App {
   public static void main(String[] args) {
	  // System.out.println( "Start");
	  //System.out.println(2/0);
	  // System.out.println("end");
	   
	   System.out.println( "Start");
	   try{
		   System.out.println(2/0);
	   }
	   catch(Exception e) {
		   
	   }
	   System.out.println("end");
   }
}
