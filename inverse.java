
public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num = 23145;
      int pos =1;
      int sum =0;
      while(num>0) {
    	  int dig = num%10;
    	 num= num/10;
    	 System.out.println(dig+" -"+pos);
    	 
    	 int ans = (int)(pos * Math.pow(10,dig-1));
    	 System.out.println(dig+" -"+pos+"-"+ans);
    	 sum = sum +ans;
    	 pos++;
      }
      System.out.println(sum);

	}

}
