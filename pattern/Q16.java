package pattern;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 0;
		int totsp = n-1;
		int totst = 5;
		while(row<2*n-1) {
			//SPACE
			int cntsp=0;
			while(cntsp<totsp) {
				System.out.print("  ");
				cntsp++;
				}
			int cntst=0;
			while(cntst<totst) {
				System.out.print("* ");
				cntst++;
			}
		
			
			row++;
			System.out.println();
			if(row<n) {
				totst--;
				totsp--;
			}
			else {
				totst++;
				totsp++;
			}
		}

	}

}
