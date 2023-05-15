package Recursion;

import java.util.ArrayList;

public class palindrom_partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<ArrayList<String>>al = new ArrayList<>();
		partitioning("aab",al);
		System.out.println(al);
	}
 
	public static void partitioning(String s, ArrayList<ArrayList<String>>al ) {
		
		
		if(s.isEmpty()) {
			//System.out.println(ans);
			return;
			
		}
		al.add(new ArrayList<>());
		for(int c =1 ;c<=s.length();c++) {
			String pi = s.substring(0,c);
			String remain = s.substring(c);
			
			if(check(pi)==true) {
				al.get(al.size()-1).add(pi);
				//System.out.println(pi);
			}
			partitioning(remain , al );  //, ans+"~~"+pi
		}
		
				
	}
	
	public static boolean check(String str) {
		int s =0;
		int e = str.length()-1;
		while(s<e) {
			if(str.charAt(s)==str.charAt(e)) {
				s++;
				e--;
			}
			else {
				return false;
			}
			
		}
		return true;
	}
}
