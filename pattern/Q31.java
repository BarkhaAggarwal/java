package pattern;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row=1;
		int totnm = 4;
		int print = 5;
		int t= 1;
		int p=1;
		while(row<=n) {
			
			int num =0;
//			if(num ==0) {
//				int totnm = 5;
//			}
			print = 5;
			while(num<totnm) {
				System.out.print(print+" ");
				print--;
				num++;
			}
			int no=0;
			p=1;
			while(no<t) {
				if (no==0){
					System.out.print("* ");
				}
				else {
					System.out.print(p+" ");
					p++;
				}
				
				no++;
			}
			
			
			t++;
			
			totnm--;
			row++;
			System.out.println();
		}

	}

}
