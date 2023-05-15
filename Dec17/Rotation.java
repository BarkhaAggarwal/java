package Dec17;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =12345;
		int rot=7;
		int bckup= num;
int nod =0;
while(num>0) {
	num=num/10;
	nod++;
	
}
num= bckup;
	System.out.println(nod);
	rot = rot%nod;
	for(int r=0;r<rot;r++) {
		int digit = num%10;
		int rem = num/10;
		System.out.println(digit+"-"+rem);
		int mul = (int)Math.pow(10, 4);
		System.out.println();
		int ans = digit*mul+rem;
		System.out.println(ans);
		
	}
	
	
	}

}
