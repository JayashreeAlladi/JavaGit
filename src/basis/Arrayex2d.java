package basis;
import java.util.Scanner;
public class Arrayex2d {
	public static  void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and cols");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int matr[][]=new int[row][col];
		
		for (int i = 0; i < row; i++) 
		{
			 for (int j = 0; j < col; j++) {
					System.out.println("enter number");
					int num=sc.nextInt();
					matr[i][j]=num;
			   }
			
		}
		for (int i = 0; i < row; i++) 
		{
			 for (int j = 0; j < col; j++) {
					System.out.print(matr[i][j]+"");
			
			   }
			System.out.println();
		}
	}

}
