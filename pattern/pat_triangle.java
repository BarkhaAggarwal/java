package pattern;

import java.util.Scanner;

public class pat_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row = 1 ;
		int totsp = n -1;
		
		int p =1;
		while(row<=n) {
			//space
			
			int cnt = 0;
			while(cnt<totsp) {
				System.out.print("  ");
				cnt++;
				
			}
			
			for (int j = row; j < 2 * row ; j++) {
                System.out.print(j + " ");
            }
			
//			 for (int j = 2 * row - 2; j >= row; j--) {
//	                System.out.print(j + " ");
//	            }
			 int cnt2 =2*row-2;
			 while(cnt2>=row) {
				 System.out.println(cnt2+" ");
				 cnt2--;
			 }
			
			
			totsp--;
			
			
			
			row++;
			
			System.out.println();
		}
	}

}
