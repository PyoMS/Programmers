package Integer_square;

import java.util.*;
class Solution {
	public long solution(long n) {
	      
	      /*
	      for(long i=1;i<=n;i++){
	    	  if(Math.pow(i, 2) == n){
	    		  System.out.println("i : " + i);
	    		  answer = (i+1)*(i+1);
	    		  break;
	    	  }else{
	    		  answer = -1;
	    	  }
	      }*/
	      if(Math.pow((int)Math.sqrt(n), 2)==n){
	    	  return (long)Math.pow((int)Math.sqrt(n)+1, 2);
	      }
	      return -1;
	      
	  }
	  public static void main(String[] args){
		  Solution s = new Solution();
		  System.out.println(s.solution(121));
		  
	  }
}