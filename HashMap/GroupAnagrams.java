package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String [] strs = {"eat","tea","tan","ate","nat","bat"};
 List<List<String>> res = groupAnagrams(strs);
 System.out.println(res.toString());
	}

	 public static List<List<String>> groupAnagrams(String[] strs) {
		 HashMap<String ,List<String>> hm = new HashMap<>();
		 for(String s : strs) {
			 char c[]= s.toCharArray();
			 Arrays.sort(c);
			 String s1 = new String(c);
			 
			 if(hm.containsKey(s1)) {
				 hm.get(s1).add(s);
				 }
			 else {
				 List<String> l = new ArrayList<>();
				 l.add(s);
				 hm.put(s1, l);
			 }
		 }
		 
		 List<List<String>> res = new ArrayList<>();
		 for(String key: hm.keySet()) {
			 res.add(hm.get(key));
		 }
		 return res;
	        
	    }
}
