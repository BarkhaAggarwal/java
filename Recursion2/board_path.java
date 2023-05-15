package Recursion2;

import javax.xml.catalog.CatalogResolver;

public class board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = { {0,1
				
		};

	}
		
		public static void solve(int r , int c , String path, int [][] maze)	{
			
			
			solve(r-1 , c , path+"U", maze);
			solve(r+1 , c , path+"D", maze);
			solve(r , c-1 , path+"L", maze);
			solve(r , c+1 , path+"R", maze);
		}

}
