package pattern;

public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5 ;
		int row =1;
		int total_sp =4;
		int total_st = 1;
	int p =1;
		while(row<=n) {
			//space
		
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("\t");
				cnt_sp++;
			}
			//1;
			int cnt_st = 0;

			while (cnt_st < total_st) {
				
				if(cnt_st<total_st/2) {
					
					//.out.print(p+"\t");
					p++;
				}else {
					
					System.out.print(p+"\t");
					p--;
					}
				System.out.print(p+"\t");
				
				p++;
				cnt_st++;
			}
			
			
			total_st = total_st+2;
			total_sp--;
			row++;
			//print++;
			System.out.println();
		}

	}

}
