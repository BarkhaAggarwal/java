
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numofdigit(407);

	}
	public static int printTill(int n) {
		return n;
		
	}
	
	public static boolean isArmstrong(int n) {
		int num = numofdigit(n);
		int ans =0;
		int backup = n ;
		while(n>0) {
			int digi = n % 10;
			ans = ans +(int)Math.pow(digi,num);
			n = n/10;
			}
		if(backup==ans) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
	public static int numofdigit(int n) {
		int count = 0;
		 while(n>0) {
	    	 n= n/10;
	    	 //System.out.println(dig+" -"+pos);
		count++;
		
		
		}
		return count;}

}
