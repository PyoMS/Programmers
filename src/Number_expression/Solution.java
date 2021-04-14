package Number_expression;
class Solution {
	
	public int solution(int n) {
	      int answer = 1;	//자기 자신은 무조건 포함이므로

	      int start_num = 1;
	      
	      for(int i=0;i<n;i++){
	    	  int tot = 0;
	    	  for(int j = start_num ; j<=n ; j++){
	    		  if(tot<n){
	    			  tot+=j;
	    		  }
	    		  else if(tot>n){
	    			  start_num++;
	    			  break;  
	    		  }
	    		  else if(tot==n){
	    			  start_num++;
	    			  answer++;
	    			  break;
	    		  }
	    	  }
	      }
	      
	      return answer;
	  }
        
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	System.out.println(s.solution(15));
    	
    	
    }
}