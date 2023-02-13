package array;

public class wave_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr [][]= {{11,12,13,14},
		       {21,22,23,24},
		       {31,32,33,34},
		       {41,42,43,44}};

		for(int c = 0;c<4;c++) {
			if(c%2==0) {
				for(int r = 0;r<4 ; r++){
					System.out.print(arr[r][c]+" ");
					}
				}
			else {
				for(int r = 3;r>=0 ; r--){
					System.out.print(arr[r][c]+" ");
					}
			}
			
	
			
			
		System.out.println();
		
	}
		
	}

}
