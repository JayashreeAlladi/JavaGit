package loop;
import java.util.Scanner;
public class Idmatr {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter rows and cols");
    	int row=sc.nextInt();
    	int col=sc.nextInt();
    	int[][] a=new int[row][col];
    	if(row!=col) {
    		System.out.println("enter same number for rows and cols to have square matrix");
    	}
    	
    	while(row==col)
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
    		inputmat(row,col,a);
    		break;
    	}
    }
    private static void inputmat(int row, int col, int a[][]) {
		// TODO Auto-generated method stub
    	boolean flag=true;
    	for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j && a[i][j]!=1) {
					flag=false;
				}
				if(i!=j && a[i][j]!=0) {
					flag=false;
				}
			}
		}
		if(flag) {
			System.out.println("given matrix is identity matrix");
		}
		else {
			System.out.println("not an identity matrix");
		}
	}
	
   
}
