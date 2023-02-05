package pattern;

import java.util.Scanner;

public class pat_moun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=0;
		int tot = 1;
		int totsp = 5;
		int p = 1;
		int p2 = 1;
		while(row<n) {
			//pat1
			int cnt = 0;
			p = 1;
			while(cnt<tot) {
				System.out.print(p+" ");
				p++;
				cnt++;
			}
			//space
			int sp = 0;
			while(sp<totsp) {
				System.out.print("  ");
				sp++;
			}
			int cnt1 = 0;
			
			while(cnt1<tot) {
				System.out.print(p2+" ");
				if(row>0) {
					p2--;
				}
				
				cnt1++;
			}
			p2++;
			
			totsp = totsp -2;
			tot++;
			row++;
			System.out.println();
		}
	}

}
