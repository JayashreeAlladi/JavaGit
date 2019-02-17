package loop;
import java.util.Scanner;
public class Tableex {
  public static void main(String[] args) {
	  Scanner sc= new  Scanner(System.in);
	  System.out.println("enter n");
	  int n=sc.nextInt();
	  int i=1;
	  while(n>0 && i<=10)
	  {
		  System.out.println(n+"*"+i+"="+(n*i));
		  i++;
	  }
  }
}
