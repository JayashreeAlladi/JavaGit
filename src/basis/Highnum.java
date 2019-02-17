package basis;
import java.util.Scanner;
public class Highnum {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter 1st num");
	 int num1=sc.nextInt();
	 System.out.println("enter 2nd num");
	 int num2=sc.nextInt();
	 System.out.println("enter 3rd num");
	 int num3=sc.nextInt();
	 if((num1==num2 )&&(num2==num3)) {
		 System.out.println("We cannot find highest number");

	 }
	 if(num1>num2 && num1>num3) {
		 System.out.println("num "+num1+" is high");
	 }
	 else if(num2>num3) {
		 System.out.println("num "+num2+" is high");
	 }
	 else
	 {
		 System.out.println("num "+num3+" is high");
	 }
 }
}
