package HashMap;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2 , 7 , 11 , 15};
		// TODO Auto-generated  method stub
		int n [] = twoSum(nums, 9);
	System.out.println(n.toString());

	}
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int res[] = new int[2];
	
		for(int i =0;i<nums.length;i++) {
			if(hm.containsKey(target-nums[i])) {
				res[0] = hm.get(target-nums[i]);
				res[1] = i;
				return res;
			}
			hm.put(nums[i], i);
		}
		return res;
	}

	 public int[] twoSum2(int[] numbers, int target) {
	      int l =0;
	      int r = numbers.length-1;
	      while(l<r){
	          int sum = numbers[l] + numbers[r];
	          if(target== sum){
	              return new int[] {l+1 , r+1};
	          }
	          else if(sum<target){
	              l++;
	          }
	          else{
	              r--;
	          }
	      }
	      return null;
	    }
}
