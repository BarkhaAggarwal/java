package array;

public class searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,5,2,1,11,9};
		
		int fnd = 9;
		 
		for(int i =0;i<arr.length;i++) {
			if (fnd == arr[i]) 
				System.out.println(i);
			}

		for(int i = arr.length-1 ; i>= 0 ; i--) {
			System.out.print(arr[i]+" "); //reverse
		}
		
		
		int high = arr.length-1;
		int low = 0;
		
			while(low<high) {
				int t = arr [low];
				arr[low]= arr[high];
				arr[high]= t ;
				high--;
				low++;
			}
			for(int c : arr) {
				System.out.print(c+" ");
			}
			
			//for(int i=0;i<high/2; i++) {
//			int t = arr [i];
//			arr[i]= arr[high-1-i];
//			arr[high-1-i]= t ;
//}
		
	}

}
