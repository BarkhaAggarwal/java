package Recursion;

public class cointoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinToss(3," ");
	}
	public static void CoinToss(int n , String s) {
		if(n==0) {
			System.out.println(s);
			return;
		}
		
		CoinToss(n-1,s+"H");
		CoinToss(n-1,s+"T");
		
	}
}
