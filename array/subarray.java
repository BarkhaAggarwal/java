package array;

public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = i ; j <arr.length;j++) {
			//System.out.print(arr[j]+" ");
				int sum = 0;
			for(int r = i ; r<=j ; r++) {
				
				sum = sum + arr[r];
				System.out.print(arr[r]+" ");
			}
			System.out.print("sum-"+sum);
			System.out.println();
			}
		}
	}

}
