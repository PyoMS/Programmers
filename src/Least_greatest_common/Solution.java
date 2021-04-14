package Least_greatest_common;
class Solution {
	 public int[] solution(int n, int m) {
	      int[] answer = new int[2];
	     
	      for(int i=n;i>0;--i){
	    	  if(n%i==0 && m%i==0){
	    		  System.out.println("i : " + i);
	    		  answer[0] = i;
	    		  answer[1] = i * n/i * m/i ;
	    		  break;
	    	  }
	      }
	      
	      return answer;
	  }
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	System.out.println(s.solution(3, 12)[1]);
    	
    }
}