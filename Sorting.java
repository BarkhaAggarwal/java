
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		int[] arr = { 50, 40, 30, 20, 10 };
		//print(arr);
		//bubleSort(arr);
		selectionSort(arr);

	}
	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}
	
	public static void bubleSort(int []arr) {
		
		for(int c = 1 ; c < arr.length;c++) {
			for(int i = 0 ; i<= arr.length-2;i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1]= temp;
				}
			}
			
		}
		print(arr);
	}
	
	public static void selectionSort(int []arr) {
		for(int last = arr.length-1; last >=1;last--) {
			int max = 0;
			for(int i = 0; i<=last; i++) {
				if(arr[i]>arr[max]) {
					max = i ;
				}
				//swapping
				
			}
			int temp = arr[max];
			arr[max] = arr[last];
			arr[last]= temp;
		}
		print(arr);
		
	}
	
	
	
	
}
