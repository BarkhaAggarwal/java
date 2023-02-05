package pattern;

public class q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int row = 1;
		int totsp = 0;
		int totst =4;
//		int totst02 =3;
		while(row<=2*n-3) {
			//star1
			int cntst01=0;
			while(cntst01<totst) {
				System.out.print("* ");
				cntst01++;
			}
		
			//SPACE
			int cntsp=0;
			if (row == 2) {
				totsp = 1;
				}
			while(cntsp<totsp) {
				System.out.print("  ");
				cntsp++;
				}
			
			int cntst02=0;
			if (row == 1|| row==2*n-3) {
				cntst02 = 1;
				}
			while(cntst02<totst) {
				System.out.print("* ");
				cntst02++;
			}
		
			
			row++;
			System.out.println();
			if(row<=n-1) {
				//totst02--;
				//totst02 = 1;
				totsp = totsp+2;
				totst--;
			}		
			else {
				totst++;
				totsp = totsp-2;
			}
		}


	}

}
