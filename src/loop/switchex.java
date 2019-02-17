package loop;
import java.util.Scanner;
public class switchex {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter your operation");
	  String i=sc.next();
	  System.out.println("enter your n1");
	  double n1=sc.nextDouble();
	  System.out.println("enter your n2");
	  double n2=sc.nextDouble();
	  switch(i)
	  {
	  case "+":System.out.println(n1+n2);
	   break;
	  case "-":System.out.println(n1-n2);
	   break;
	  case "*":System.out.println(n1*n2);
	   break;
	  case "/":System.out.println(n1/n2);
	   break;
	   default:System.out.println("invalid");
       break;
	  }
  }
}
