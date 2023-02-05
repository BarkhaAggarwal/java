package pattern;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int totsp = 0;
		int totst = 9;
		while(row<=n) {
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
			
			totst = totst-2;
			totsp++;
			row++;
			System.out.println();
		}

	}

}
