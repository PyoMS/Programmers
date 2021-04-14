package budget;

import java.util.Arrays;

class Solution {
	  public int solution(int[] d, int budget) {
	      int answer = 0;
	      Arrays.sort(d);
	      for(int i=0;i<d.length;i++){
	    	  if(budget >= d[i]){
	    		  answer++;
	    		  budget -= d[i];
	    	  }
	    	  System.out.println(budget);
	      }
	      return answer;
	  }
	  public static void main(String[] args){
		  Solution s = new Solution();
		  int[] d = {100,30,30,30,40,1,1,1,1,1,1,1,1,1,1};
		  System.out.println(s.solution(d, 90));
	  }
}