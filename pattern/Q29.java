package pattern;

public class Q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5 ;
		int row =1;
		int total_sp =4;
		int total_st = 1;
	     int printn = 0;
	     int print =0;
		while(row<=n) {
			//space
		
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			//1;
			int cnt_st = 0;
		
			while (cnt_st < total_st) {
			if(cnt_st==0|| cnt_st == total_st-1) {
					printn++;
					System.out.print(printn+" ");
				}
			else {
				print =0;
				System.out.print(print+" ");
			}
				cnt_st++;
			}
			
			
			total_st = total_st+2;
			total_sp--;
			row++;
			System.out.println();
		}
	}

}
