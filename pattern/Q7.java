package pattern;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int row = 1;
		//int tot_st=5;
		while(row<=n) {
			int cnt =0;
			while(cnt<5) {
			if(row==1 || row==n || cnt==0 || cnt==n-1) {
				//if(cnt==1 || cnt==n)
				System.out.print("* ");
				
			}
			else {
				System.out.print(" ");
			}
			cnt++;
			}
			
			
			
			row++;
			System.out.println();
		}

	}

}
