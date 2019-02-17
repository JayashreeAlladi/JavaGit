package loop;

import java.util.Scanner;

public class Diagonalsum {
	
   
	private static  void diagsum(int row,int col,int[][] a) {
		 int sum1=0;
		 int sum2=0;
		 for (int i = 0; i < row; i++) 
			{
				 for (int j = 0; j < col; j++) 
				 {
				    if(i==j) {
				    	sum1=sum1+a[i][j];//right side diagonal
				    }
				  
			     }
				
			}
		 System.out.println(sum1);
	 }
	
	public static  void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and cols");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		
	if(row==col)
	{
		for (int i = 0; i < row; i++) 
		{
			 for (int j = 0; j < col; j++) {
					System.out.println("enter number");
					int num=sc.nextInt();
					a[i][j]=num;
			   }
			
		}
		for (int i = 0; i < row; i++) 
		{
			 for (int j = 0; j < col; j++) {
					System.out.print(a[i][j]+" ");
			
			   }
			System.out.println();
		}
		diagsum(row,col,a);
	}
 }
}