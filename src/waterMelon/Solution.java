package waterMelon;

//길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을
//완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
class Solution {
	
	  public String solution(int n) {
		  int cnt=0;
	      String answer = "";
	      
	      while(!(n==cnt)){
	    	  cnt++;
	    	  System.out.println(cnt);
	    	  if(cnt%2 == 0){
	    		  answer+="박";
	    	  }else if(cnt%2 ==1){
	    	
	    		  answer+="수";
	    	  }
	      }
	      return answer;
	  
	  }
	  public static void main(String[] args){
		  Solution s = new Solution();
		  System.out.println(s.solution(3));
	  }
}