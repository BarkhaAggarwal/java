package pattern;

import java.util.Scanner;

public class Mirror_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int totsp = n/2;
		int totst = 1;
		int row = 0 ;
		
		
		while(row<n) {
			//space
			
			int cnt = 0;
			while(cnt<totsp) {
				System.out.print("  ");
				cnt++;
				
			}
			
			
			
			//star
			
			int cntst =0;
			while(cntst<totst) {
				System.out.print("* ");
				cntst++;
			}
			
			row++;
			System.out.println();
			
			
			
			if(row<=n/2) {
				totsp--;
				totst = totst +2;
			}
			else {
				totsp++;
				totst = totst -2;
			}
			
			
		}
		
		
		
		
	}

}
