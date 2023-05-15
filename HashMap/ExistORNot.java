package HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class ExistORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int j =0;j<t;j++) {
			int n = sc.nextInt();
			int a[]= new int[n];
			HashSet<Integer> hs = new HashSet<>();
			for(int i =0;i<n;i++) {
				a[i] = sc.nextInt();
				hs.add(a[i]);
			}
			
			int q = sc.nextInt();
			
			for(int i = 0;i<q;i++) {
				int q1 = sc.nextInt();
				if(hs.contains(q1)) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
		}
		
	}


}
