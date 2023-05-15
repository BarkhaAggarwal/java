package fang;

public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345;
		int r = 3;
		
		int bckup= num;
		int nod=0;
		while(num>0) {
			num = num/10;
			nod++;
		}
		num= bckup;
		int dividend = (int)Math.pow(10,3);
		int p1= num/dividend;
		int p2=num%dividend;
		System.out.println(p1+"-"+p2);
		
		int mul= (int)Math.pow(10, nod-r);
		System.out.println(p2*mul+p1);

	}

}
