package pattern;

public class q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		
		int total_st = 5;
		int total_sp = 0;

		while (row <= n) {
//          *1
			int cnt_st1 = 0;
			while (cnt_st1 < total_st) {
				System.out.print("* ");
				cnt_st1++;
			}
//			space
			int cnt_sp = 0;
			if (row==2) {
				total_sp= 1;
			}
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			
//          *2
			int cnt_st2 = 0;
			if (row == 1) {
				cnt_st2 = 1;
			}
			while (cnt_st2 < total_st) {
				System.out.print("* ");
				cnt_st2++;
			}

			row++;
			total_st--;
			total_sp = total_sp + 2;
			System.out.println();
		}
		
		
	}

}
