package next_large_number;
class Solution {
//	int n_cnt;
	public int solution(int n) {
		/*
	      int answer = 0;
	      int temp_num=n+1;
	      String str = Integer.toBinaryString(n);
	      int cnt = 0;
	      for(int i=0;i<str.length();i++){
	    	  if(str.charAt(i)=='1'){
	    		  cnt++;
	    	  }
	      }
	      n_cnt = cnt;
	      cnt=0;
	      
	      while(n_cnt!=cnt){
	    	  
	    	  str = Integer.toBinaryString(temp_num);
	    	  for(int i=0;i<str.length();i++){
		    	  if(str.charAt(i)=='1'){
		    		  cnt++;
		    	  }
		      }
	    	  if(n_cnt==cnt){
	    		  answer = temp_num;
	    		  break;
	    	  }else{
	    		  temp_num++;
	    		  cnt=0;
	    	  }
	    		  
	      }
	      */
		
		int postPattern = n & -n, smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
		System.out.println(postPattern);
		System.out.println(smallPattern);
		System.out.println(77 + postPattern | smallPattern);
			return n + postPattern | smallPattern;
			
			
			
//	      return answer;
	  }
        
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	System.out.println(s.solution(78));
    	
    	
    }
}