package loop;
import java.util.Scanner;
public class revex {
   public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in); 
	   System.out.println("enter a  num");
	   int num=sc.nextInt();
	   while(num!=0)
	   {
	    int rem=num%10;
	    int rev=0;
	    rev+=rem;
	    num=num/10;
       }
	   
}
}