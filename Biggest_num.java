package ArrayList;


import java.util.Scanner;

public class Biggest_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Scanner sc = new Scanner(System.in);
	
 int t = sc.nextInt();
	
	for(int i = 0;i<t ; i++) {
		int n1 = sc.nextInt();
		int arr[] = new int[n1];
		
		
		for(int j = 0;j<n1;j++) {
			arr[j]= sc.nextInt();
		}
		
		
		for(int c=1;c<=arr.length-1;c++) {
			for(int k=0;k<=arr.length-2;k++) {
				if(compare(arr[k],arr[k+1])<0) {
					int temp = arr[k];
					arr[k]=arr[k+1];
					arr[k+1]= temp;
				}
			}
		}
		String ans = "";
		for(int ali :arr) {
			 ans = ans +ali;
			 
		}
  System.out.println(ans);
	}
	}
	
	public static int compare(int n1 , int n2) {
		long c1 = Long.parseLong(n1 + "" + n2);
		long c2 = Long.parseLong(n2 + "" + n1);
		
	if(c1>c2) {
		return  1;
		
	}else {
		return -1;
	}
	}
}
