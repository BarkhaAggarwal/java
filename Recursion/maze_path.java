package Recursion;

import java.util.ArrayList;

public class maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3; //row
		int n=7; //col
//		System.out.println(solve(m , n , 1,1));
//		System.out.println(solve2(m , n , 1,1,""));
		ArrayList<String>al = new ArrayList<>();
		System.out.println(solve3(m , n , 1,1,al));;
	}
	
	public static int solve(int m , int n , int i , int j) {
		if(i>m || j>n) {
			return 0;
		}
		
		if(i==m && j==n) return 1;
		 
		int sp1 = solve(m , n , i , j+1);   //moving right
		int sp2 = solve(m , n , i+1 , j);   //moving down
		
		return sp1+sp2;
		
	}
	public static int solve2(int m , int n , int i , int j, String path) {
		if(i>m || j>n) {
			return 0;
		}
		
		if(i==m && j==n) {
			System.out.println(path);
			System.out.println("**********************************");
			return 1;
		}
			
		 
//		int sp1 = solve2(m , n , i , j+1,path+" ("+i+" "+j+")"); 
		int sp1 = solve2(m , n , i , j+1,path+"R"); //moving right
//		int sp2 = solve2(m , n , i+1 , j, path+" ("+i+" "+j+")"); 
		int sp2 = solve2(m , n , i+1 , j, path+"D"); //moving down
		
		return sp1+sp2;
		
	}
	public static int solve3(int m , int n , int i , int j, ArrayList<String>al) {
		if(i>m || j>n) {
			return 0;
		}
		
		if(i==m && j==n) {
			System.out.println(al);
			System.out.println("**********************************");
			return 1;
		}
		
		al.add("R");
		int sp1 = solve3(m , n , i , j+1,al); //moving right
        al.remove(al.size()-1);
		
		al.add("D");
		int sp2 = solve3(m , n , i+1 , j, al); //moving down
		al.remove(al.size()-1);
		return sp1+sp2;
		
	}
}
