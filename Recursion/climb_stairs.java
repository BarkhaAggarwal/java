package Recursion;

import java.util.Scanner;

public class climb_stairs {
static int c =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        stairs(0," ", n);
      
        System.out.println(c);
	}

	
	
	public static void stairs(int curr, String path, int dest) {
		
		if(curr== dest) {
			//System.out.println(path);
			c++;
			return;
		}
		if(curr>dest) {
			return;
		}
		
		stairs(curr+1,path+1, dest);
		stairs(curr+2,path+2, dest);
		
	}
}
