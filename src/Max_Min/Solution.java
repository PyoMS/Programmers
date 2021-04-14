package Max_Min;

import java.util.*;

class Solution {
	public String solution(String s) {
	      String answer = "";
	      String[] arr = s.split(" ");
	      int max = -999999; int min = 999999;
	      for(int i=0;i<arr.length;i++){
	    	if(max < Integer.parseInt(arr[i])){
	    		max = Integer.parseInt(arr[i]);
	    	}
	    	if(min > Integer.parseInt(arr[i])){
	    		min = Integer.parseInt(arr[i]);
	    	}
	      }
	      answer = min+" "+max;
	      return answer;
	  }
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	System.out.println(s.solution("1 2 3 4"));
    
    }
}