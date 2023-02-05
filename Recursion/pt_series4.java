package Recursion;

public class pt_series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pdi(1,4);
	}
	
	public static void pdi(int i, int n) {
		if(i>n) {
			return;
		}
		
		
		System.out.println(i);
		
		pdi(i+1 , n);
		System.out.println(i);
		
	}
	

}
