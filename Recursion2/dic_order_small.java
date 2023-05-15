package Recursion2;

import java.util.Arrays;
import java.util.Scanner;

public class dic_order_small {
	static boolean stop = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		int batua [] = new int [26];
		for(int i=0;i<s.length();i++) {
			batua[s.charAt(i)-'a']++;
		}
		//System.out.println(Arrays.toString(batua));
		prem(batua, "", s);
	}
	
public static void prem(int[] batua, String path, String org) {
		
		boolean ans = false;
		for (int i = 0; i < 26; i++) {
			if (batua[i] > 0) {
				ans = true;
				batua[i]--;
				char ch = (char) ('a' + i);
				prem(batua, path + ch, org);
				if(stop) {
					return;
				}
				batua[i]++;
			}
		}
		if (ans == false) {
			if(path.equals(org)) {
				stop = true;
				return;
			}
			System.out.println(path);
			
		}
	}

}
