package array;

public class rot_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		
	int rot = 3 ; //clockwise
	rot = rot % arr.length;
	if(rot<0) {
		rot = rot+arr.length; //anti-clockwise
	}
	for(int r=0; r<rot;r++) {
		int j = arr[arr.length-1];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = j;	
	}
	
		
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	}

	public static void REv(int []arr, int rot) {
		
	}
}
