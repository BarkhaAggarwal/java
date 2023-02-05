package pattern;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 0;
		int totsp = 1;
		int totst01 = 3;
		
		while(row<2*n-3) {
			//sPACE
			int cntsP01=0;
			while(cntsP01<totst01) {
				System.out.print("  ");
				cntsP01++;
			}
		
			//STAR 
			int cntsp=0;
			while(cntsp<totsp) {
				System.out.print("* ");
				cntsp++;
				}
			
		
			
			row++;
			System.out.println();
			if(row<n-1) {
				
				totsp = totsp+2;
				totst01--;
			}
			else {
				
				totst01++;
				totsp = totsp-2;
			}
		}

	}

}
