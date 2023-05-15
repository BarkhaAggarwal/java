import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte n = sc.nextByte();
		int row = 1;
		int totsp = 0 ;
		int tot = 11;
		int p = 5;
		while(row <= 2*n+1) {
			//space
			int cntsp =0;
			while(cntsp<totsp) {
				System.out.print("\t");
				cntsp++;
			}
			
			//print
			int cnt = 0;
			
			while(cnt<tot) {
				System.out.print(p+"\t");
				if(cnt>=(tot/2)) {
					p++;
				}else {
					
					p--;
					}
				
				cnt++;
			}
			
		
			
			
			if(row<n+1) {
				totsp++;
				tot= tot-2;
			}
			else {
				totsp--;
				tot=tot+2;
			}
			
			row++;
			System.out.println();
		}

	}

}
