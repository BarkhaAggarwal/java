
public class polynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int sum =0;
		
		int x = 7 ;
		int n =3;
		//operation done by math.pow is log n
		for(int c =1;c<=n;c++) { 
			sum = sum + (int) (c*(Math.pow(x, c)));   //nlogn 
			
		}
		
		
		
		
	}

}
