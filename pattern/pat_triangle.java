package pattern;

import java.util.Scanner;

public class pat_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row = 0 ;
		int totsp = n -1;
		int totp = 1;
		int p =1;
		while(row<n) {
			//space
			
			int cnt = 0;
			while(cnt<totsp) {
				System.out.print("  ");
				cnt++;
				
			}
			//no pat
			
			
			int cntp =0;
			while(cntp<totp) {
				System.out.print(p+" ");
				
				
				cntp++;
				if(row!=0) {
					if(cntp<=totp/2) {
						p++;
					}else {
						p--;
					}
				}
				
					
				
			}
			
			
			totp = totp +2;
			totsp--;
			
			row++;
			p++;
			
			System.out.println();
		}
	}

}
