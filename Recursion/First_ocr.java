package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class First_ocr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {30, 20,20,30,20,10,30,40};
		int n = a.length-1;
	 System.out.println(first_oc(a,30,0));
	 System.out.println("***************");
	 System.out.println(last_oc(a,30,n));
	 System.out.println("***************");
	//System.out.println(Arrays.toString(all_oc(a,0,30, 3));
	 
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


public static int[] all_oc(int a[] ,int i , int ali , int cnt) {
	
	if(i==a.length) {
		return new int[cnt];
	}
	
	
	if(a[i]==ali) {
		
	int [] sp = all_oc(a,i+1,ali,cnt+1);
	sp[cnt] = i;
}
	else {
		int [] sp = all_oc(a,i+1,ali,cnt);
	}
	return a;




}

















}
