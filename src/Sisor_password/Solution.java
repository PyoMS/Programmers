package Sisor_password;

class Solution {
	  public String solution(String s, int n) {
	      String answer = "";
	      char char_temp ;
	      int int_temp;
	      for(int i=0; i< s.length();i++){
	    	  int_temp = (int)s.charAt(i);
	    	  
	    	  if(65 <= int_temp && int_temp <= 90){
	    		   if(int_temp+n > 90){
	    			   
	    			   answer += Character.toString((char)(int_temp+n-26));
	    		   }else{
	    			   answer += Character.toString((char)(int_temp+n));
	    		   }
	    		   
	    	  }
	    	  else if (97 <= int_temp && int_temp <= 122){
	    		  if(int_temp+n > 122){
	    			   answer += Character.toString((char)(int_temp+n-26));
	    		   }else{
	    			   answer += Character.toString((char)(int_temp+n));
	    		   }
	    	  }
	    	  else if(s.charAt(i)==' '){
	    		  answer += " ";
	    	  }
	    	  
	      }
	      return answer;
	  }
	  //´ë¹®´Ù A = 65 , Z = 90 , a = 97 , z = 122
	  public static void main(String[] args){
		  Solution s = new Solution();
		  System.out.println(s.solution("z", 1));
	  }
}