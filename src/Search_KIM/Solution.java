package Search_KIM;

import java.util.*;

class Solution {
	  public String solution(String[] seoul) {
	      String answer = "";
	      /*
	      for(int i=0; i<seoul.length;i++){
	    	  if(seoul[i].equals("Kim")){
	    		  answer = "�輭���� "+ i +"�� �ִ�";
	    		  return answer;
	    	  }
	      }
	   */
	      
	      int x = Arrays.asList(seoul).indexOf("Kim");
	      return "�輭���� "+ x +"�� �ִ�";
	  }
	  public static void main(String[] args){
		  Solution s = new Solution();
		  String[] temp = {"jane", "Kim"};
		  System.out.println(s.solution(temp));
		  
	  }
}