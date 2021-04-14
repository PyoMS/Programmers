package Integer_Dec;

import java.util.*;
class Solution {
		public long solution(long n) {
			ArrayList arr = new ArrayList();
			String num="";
			for(int i=0;i<(n+"").length();i++){
				arr.add((n+"").charAt(i));
			}
			Collections.sort(arr);
			Collections.reverse(arr);
			Iterator it = arr.iterator();
			while(it.hasNext()){
				num += it.next().toString();
			}
			return Long.parseLong(num);
	  }
	  public static void main(String[] args){
		  Solution s = new Solution();
		  System.out.println(s.solution(156782114));
		  
	  }
}