package array;

public class arr_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[10];
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= 3 * (i +1) ;
   System.out.print(arr[i]+" ");
		}
	System.out.println();
for(int c : arr) {
	System.out.print(c+" ");
}
	}

}
