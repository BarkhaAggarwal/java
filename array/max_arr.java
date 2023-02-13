package array;

public class max_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,5,2,1,11,9};
	
		int max = arr[0];
		 
		for(int i =0;i<arr.length;i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println(max);
	}

}
