package fang;

public class generate_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(0,0,2," ");
	}

	
	
	public static void generate(int cl, int op , int n , String path) {
		
		if(cl>op) {
			return;
		}
		if(cl==n && op==n ) {
			System.out.println(path);
			return;
		}
		if(op<n) {
			generate(cl, op+1 , n , path+"(");
		}
		if(cl<n) {
			generate(cl+1, op , n  , path+")");
			
		}
		
		
		
	}
}
