package array;

import java.util.Scanner;

public class Chewbacca_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		long x = sc.nextLong();
		long ans=0;
		long n =0;
		
		while(x>0) {
			long dig = x%10;
			if(dig>4) {
				dig = 9-dig;
			}
			
			if(dig==x && ans ==0) {
				ans = dig;
			}
			else {
				ans = ans *10 + dig;
			}
			 x = x/10;
			
		}
		
		while(ans>0) {
			long rem = ans % 10;
			n = n *10 + rem ;
			ans = ans/10;
		}
		System.out.println(n);

	}

}
