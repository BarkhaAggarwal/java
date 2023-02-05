package pattern;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 0;
		int totsp = 0;
		int totst = n;
		while(row<n) {
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
			
			totst--;
			totsp++;
			
			row++;
			System.out.println();
		}

	}

}
