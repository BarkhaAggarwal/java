package Recursion;

public class maximum_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, 20,30,40};
		int n = a.length-1;
		System.out.println(Max(a,0));
		//System.out.println(find(a , 0 , 30));
		find(a,0,30);
	}
	
	public static int Max(int a[], int i) {
		if(i==a.length) {
			return Integer.MIN_VALUE;
		}
		
		
		int s = Max(a, i+1);
		if(s>a[i]) {
			return s;
		}else {
			return a[i];
		}
	}
	
	
	public static void find(int a[], int i , int f) {
		if(i==a.length) {
			return ;
		}
		if(f == a[i]) {
			System.out.println(i);
		}
		
		 find(a, i+1, f);
		
	}
	
//	public static boolean find(int a[], int i , int f) {
//		if(i==a.length) {
//			return false ;
//		}
//		if(f == a[i]) {
//			System.out.println(i);
//		}
//		
//		 find(a, i+1, f);
//		
//	}

}
