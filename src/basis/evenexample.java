package basis;
import java.util.Scanner;
public class evenexample {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		if(num%2==0)
		{
			num=num+10;
		}
		else
		{
			num=num+15;
		}
		System.out.println(num);
	}

}
