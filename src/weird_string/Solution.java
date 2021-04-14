package weird_string;

class Solution {
	
	public String solution(String s) {
		
	      String answer = "";
	      int cnt=0;
	      
	    	  for(int i=0;i<s.length();i++){
	    		  if(s.charAt(i) == ' '){
	    			  cnt = 0;
	    			  answer += " ";
	    		  }
	    		  else if(cnt%2==0){
	    	          answer += Character.toUpperCase(s.charAt(i));
	    	          cnt++;
	    	      }
	    		  else if(cnt%2==1){
	    	              answer += Character.toLowerCase(s.charAt(i));
	    	          cnt++;
	    	      }
	    	  }
	    	
	      
	      return answer;
	  }
	  public static void main(String[] args){
		  Solution s = new Solution();
		  System.out.println(s.solution("QWEASD qwesadqwe QWEs QDSE"));
	  }
}