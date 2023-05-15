import java.util.Scanner;

public class rev_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {2,4,3,1,0};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i = 0;i<n ; i++) {
			arr[i]= sc.nextInt();
		}
		int arr1[]= new int[arr.length]	;
		for(int i = arr.length-1; i>=0; i--) {
			int a = arr[i];
			for(int j = 0 ; j <arr1.length; j++) {
				arr1[a]= i;
				
			}
			
		}
		for(int i = 0 ; i <arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
