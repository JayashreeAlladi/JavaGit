package Arraysex;
import java.util.Scanner;
public class Fruitex {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter apples on/out of tree");
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        System.out.println("enter oranges on/out of tree");
        int n2=sc.nextInt();
        int o[]=new int[n2];
        
       for(int i=0;i<n1;i++) {
    	   System.out.println("enter distances at which apples were fallen");
    	   int num1=sc.nextInt();
    	   a1[i]=num1;

    	   }
       for(int i=0;i<n2;i++) {
    	   System.out.println("enter distances at which oranges were fallen");
    	   int num2=sc.nextInt();
    	   o[i]=num2;
       }
      nearfruit(s,t,a,b,a1,o);  
    }

	private static void nearfruit(int s, int t, int a, int b, int[] a1, int[] o) {
		// TODO Auto-generated method stub
		int acount=0;
		int ocount=0;
		for (int i = 0; i < a1.length; i++) {
		    
			if(a1[i]+a>=s && a1[i]+a<=t) {
				acount++;
			}
		}
		for (int i = 0; i < o.length; i++) {
			if(o[i]+b<=t && o[i]+b>=s) {
				ocount++;
			}
		}
		System.out.println(acount);
		System.out.println(ocount);
	}
    
}
