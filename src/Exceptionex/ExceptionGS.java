package Exceptionex;

public class ExceptionGS {
     public static void main(String[] args) {
    	 int arr[]= {1,2,3,4,5};
    	 System.out.println("start of flow");
    	 
    	 try {
    		 System.out.println(7/0);
    	 }
    	 catch(ArithmeticException e) {
     		System.out.println("specific to exception"); 
     	 }
    	 catch(Exception e) {//here even it is upper class, the exception goes to specific one.
    		 System.out.println("mother exception");
    	 }
    	// catch(ArithmeticException e) {
    	//	System.out.println("specific to exception"); 
    	// }
     }
}
