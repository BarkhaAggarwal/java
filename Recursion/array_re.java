package Recursion;

public class array_re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, 20,30,40};
		int n = a.length-1;
		
		recur(a,0);
		System.out.println("***********************");
		reverse(a,n);
		System.out.println("****************");
		reverse1(a,0);
	}
	
	public static void recur(int arr[],int i) {
		
		if(i== arr.length) {
			return;
		}
		
		System.out.println(arr[i]);
		recur(arr,i+1);
	}
	
public static void reverse(int arr[],int i) {
		
		if(i<0) {
			return;
		}
		
		System.out.println(arr[i]);
		reverse(arr,i-1);
	}

public static void reverse1(int arr[],int i) {
	
	if(i== arr.length) {
		return;
	}
	reverse1(arr,i+1);
	System.out.println(arr[i]);
}

}
