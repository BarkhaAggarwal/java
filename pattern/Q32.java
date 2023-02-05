package pattern;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int p =1;
		int tot =1;
		while(row<=2*n-1) {
			int cnt=0;
			while(cnt<tot) {
				if(cnt%2==0) {
					System.out.print(p+" ");
					p++;
				}
				else {
					System.out.print("* ");
				}
				
				cnt++;
			}
			row++;
			System.out.println();
			
			if(row<=n) {
				tot= tot+2;
			}
			else {
				tot= tot-2;
			}
			
		}
		

	}

}
