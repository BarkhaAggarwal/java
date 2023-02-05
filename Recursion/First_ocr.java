package Recursion;

public class First_ocr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, 20,20,30,20,10,30,40};
		int n = a.length-1;
	 System.out.println(first_oc(a,30,0));
	 System.out.println("***************");
	 System.out.println(last_oc(a,30,n));
	 System.out.println("***************");
	 System.out.println(all_oc(a,30,0));
	 
	}

	
	
	public static int first_oc(int a[] ,int f , int i) {
		
		if(i == a.length) {
			return -1;
			}
		
		if(a[i]==f) {
			return i;
		}
		 int s = first_oc(a , f , i+1);
		 
		
		return s;
	}
	
public static int last_oc(int a[] ,int f , int i) {
		
		if(i<0) {
			return -1;
			}
		
		if(a[i]==f) {
			return i;
		}
		 int s = last_oc(a , f , i-1);
		 
		
		return s;
	}


public static int[] all_oc(int a[] ,int f , int i) {
	
	if(i==a.length) {
		int a1 []= new int [0];
		return a1;
		}
	
	 int s []= all_oc(a , f , i+1);
	 
	 if(a[i]==f) {
		 int a2 []= new int [s.length+1]; 
	 }
	
	return s;
}

















}
