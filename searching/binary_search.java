package searching;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {10 , 20 , 30,40 ,50};
		find(arr,30);
		

	}
	
	
	public static void find(int []v, int To_Find) {
		
		int lo=0;
		int hi = v.length-1;
          while (hi - lo > 1) {
		
	        int mid = (hi + lo) / 2;
	        if (v[mid] < To_Find) {
	            lo = mid + 1;
	        }
	        else {
	            hi = mid;
	        }
	    }
	    if (v[lo] == To_Find) {
	      System.out.println( lo );
	    }
	    else if (v[hi] == To_Find) {
	        System.out.println( hi );
	    }
	    else {
	        System.out.println("-1" );
	    }

//	
	}

}
