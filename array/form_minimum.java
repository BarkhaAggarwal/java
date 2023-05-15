package array;

import java.util.Arrays;
import java.util.Scanner;

public class form_minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		 sc.nextLine();
		 String[] arr = new String[n];
			
			
			for(int j = 0;j<n;j++) {
				
				arr[j]= sc.nextLine();
			}
			
			for(int i = 0; i<n ;i++) {
				String s = arr[i];
//				StringBuilder s1 = new StringBuilder(s);
				int[] a = new int[s.length() + 1];
				//System.out.println(a.length);
				int countD = 0;
				int num = 1;
				for(int k = 0;k<=s.length();k++) {
					if (k < s.length() && s.charAt(i) == 'D') {
						countD++;
				      }
					else {
					for (int count = 1; count <= countD + 1; count++) {
						a[k - count + 1] = num ;
						num++;
					}
					countD=0;
			}
			
			
	}
			for(int ali: a) {
				System.out.print(ali);
			}
				//System.out.println(Arrays.toString(a));		

}
	}
	}
