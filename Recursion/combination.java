package Recursion;

public class combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean [] placed = new boolean[4];
		queen(2,-1,"", 4);
		System.out.println("****************");
		com(2,0,"",4);
	}

public static void queen(int n , int last, String ans , int seats ) {
		//boolean[]placed
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = last+1;i<seats;i++) {
			queen(n-1,i, ans+"Q"+i , seats);
			}
			
			
		}
		


public static void com(int n ,int idx ,String path ,int seats) {
	if(n==0) {
		System.out.println(path);
		return;
	}
	if(idx<seats) {
		com(n-1 ,idx+1,path+"Q"+idx , seats );
		com(n ,idx+1,path,seats );
	}
	}	

public static void comb2d(int r , int c, int n , String path , int tot_r, int tot_c ) {
	if(n==0) {
		System.out.println(path);
		return;
	}
	if(c==tot_c) {
		r++;
		c=0;
	}
	comb2d(r, c+1,n-1,path+"{"+r+","+c+"}", tot_r,)
}
	
}

