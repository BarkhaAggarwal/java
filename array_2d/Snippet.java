package array_2d;

import java.util.ArrayList;

public class Snippet {
	public static void main(String[] args) {
		
	}
	  
	
	public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> a = new ArrayList<>();

        for(int i =0;i<nums.length-1;i++){
            for(int j=i+1 ; j<nums.length;j++){
           if(nums[i]+nums[j] == target){
//                   a.add(i);
//                   a.add(j);
        	   return new int [] {i,j};
            }
            }
        }
     
        return new int []{};
    }
}

