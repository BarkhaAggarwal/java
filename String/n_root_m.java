package String;

import java.util.Scanner;

public class n_root_m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			
			 int nthRoot = findNthRoot(N, M);
		        System.out.println(nthRoot);
		}
		
	}
	
	
	public static int findNthRoot(int N, int M) {
		int ans =  (int)Math.pow(M, 1.0/ N);
        return ans;
    }


}
