package basis;

import java.util.Scanner;

public class ChocoDis {
	 public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int chocos=sc.nextInt();
    	 int persons=sc.nextInt();
    	 chocodis(chocos,persons);
    	 
}

	private static void chocodis(int chocos, int persons) {
		// TODO Auto-generated method stub
		if(chocos%persons==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
