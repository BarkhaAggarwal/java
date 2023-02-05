package pattern;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int row = 0;
		int totsp = 1;
		int totst01 = 3;
		int totst02 =3;
		while(row<2*n-3) {
			//star1
			int cntst01=0;
			while(cntst01<totst01) {
				System.out.print("* ");
				cntst01++;
			}
		
			//SPACE
			int cntsp=0;
			while(cntsp<totsp) {
				System.out.print("  ");
				cntsp++;
				}
			int cntst02=0;
			while(cntst02<totst02) {
				System.out.print("* ");
				cntst02++;
			}
		
			
			row++;
			System.out.println();
			if(row<n-1) {
				totst02--;
				totsp = totsp+2;
				totst01--;
			}
			else {
				totst02++;
				totst01++;
				totsp = totsp-2;
			}
		}

	}

}
