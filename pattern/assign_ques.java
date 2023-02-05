package pattern;

import java.util.Scanner;

public class assign_ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Byte n = sc.nextByte();
		int row= 0;
		int p = 1;
		
		int tot = 1 ;
		int totsp = 5;
		while(row<n) {
			//p1
			int cnt = 0;
			if(cnt==0) {
				p = 1;
			}
			while(cnt<tot) {
				System.out.print(p+"\t");
				p++;
				cnt++;
			}
			
			//space
			int cntsp = 0;
			while(cntsp<totsp) {
				System.out.print("\t");
				cntsp++;
			}
			
			//p2
			int cnt2 = 0;
			
			
			if(row==n-1) {
				cnt2 = 1;
				p = 3;
			}
			while(cnt2<tot) {
				System.out.print(p+"\t");
				p--;
				cnt2++;
			}
			if(cnt==0) {
				p = 3;
			}
			
			
            totsp= totsp -2;
			
			tot++;
			row++;
			System.out.println();
			

		}
	}

}
