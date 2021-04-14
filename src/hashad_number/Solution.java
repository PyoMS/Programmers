package hashad_number;
import java.util.HashMap;;
class Solution {
	 public boolean solution(int x) {
	      boolean answer = false;
	      String num = x+"";
	      int temp=0;
	      
	      for(int i=0;i<num.length();i++){
	    	  temp +=Integer.parseInt(num.charAt(i)+"");
	    	  System.out.println(Integer.parseInt(num.charAt(i)+""));
	      }
	      if(x%temp == 0){
	    	  answer = true;
	      }
	      return answer;
	  }
        
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	System.out.println(s.solution(13));
    	
    	
    }
}