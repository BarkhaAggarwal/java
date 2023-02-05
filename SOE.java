
public class SOE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =25;
allprime(n);
	}

	public static void allprime(int n) {
		boolean []iscomp = new boolean[n+1];
		
		for(int div =2;div*div<=n;div++) {
			
			if(iscomp[div]==true) {
				continue;
			}
			for(int table = div *div;table <= n ; table = table +div) {
				iscomp[table] = true;
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(iscomp[i]==false) {
				System.out.println(i);
			}
		}
	}
	
}
