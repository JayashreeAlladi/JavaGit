package basis;

import java.util.Scanner;

public class Photoupload {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int L=sc.nextInt();//length a facebook page provide for uploading pic
    	 int W=sc.nextInt();
    	 int H=sc.nextInt();
    	 photoupload(L,W,H);
     }

	private static void photoupload(int l, int w, int h) {
		// TODO Auto-generated method stub
		if(w<l || h<l) {
			System.out.println("upload another");
		}
		else if( w==h) {
			if(w>=l || h>=l) {
			System.out.println("accepted");
			}
		}
		else if(w>=l || h>=l) {
			System.out.println("crop it");
		}
	
	}
}
