package pattern;

import java.util.Scanner;

public class inverted_HG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int totst = 1 ;
		int totsp = 11;
		int p = 5;
		
		while(row <= 2*n+1) {
			//print1
			int cntst =0;
			
				p = 5;
			
			while(cntst<totst) {
				System.out.print(p+" ");
				p--;
				cntst++;
			}
		//space
          int cntsp = 0;
			
			while(cntsp<totsp) {
				System.out.print(" "+" ");
			cntsp++;
			}
			
			
			
			int cntst1 =0;
			if(row==1 || row==2*n+1) {
				p = 5;
			}
			
			while(cntst1<totst) {
				System.out.print(p+" ");
				p++;
				cntst1++;
			}
			
			p--;
			
			
			
			
			
		
		
		
			if(row<n+1) {
				totst++;
				totsp= totsp-2;
			}
			else {
				totst--;
				totsp=totsp+2;
			}
			
			row++;
			System.out.println();
		}
		
		
		
		
		
		
	}

}
