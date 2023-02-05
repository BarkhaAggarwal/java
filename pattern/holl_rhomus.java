package pattern;

import java.util.Scanner;

public class holl_rhomus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
		
		int row = 1;
		int tot = n-1;
		int totst = n;
		while(row<=n) {
			//space
			int cnt = 0;
			while(cnt<tot){
				System.out.print(" ");
				cnt++;
			}
			//star
			int cntst= 0;
			while(cntst<totst) {
				if(cntst==0 || row==1 || row==n || cntst==totst-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
				cntst++;
			}
			
			
			
			tot--;
			row++;
			System.out.println();
		}
	}

}
