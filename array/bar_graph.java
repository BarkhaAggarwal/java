package array;

public class bar_graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,6,1};
		int max= arr[0];
		
		
			for(int i = 0 ; i <arr.length;i++) {
				if(max<arr[i]) {
					max= arr[i];
					
					}
			}
			
          for(int i = max ; i >0;i--) {
				for(int a : arr) {
					if(a>=i) {
						System.out.print(" ");
					}
					else {
						System.out.print("|");
					}
				}
				
			}
			
		
		
		
	}

}
