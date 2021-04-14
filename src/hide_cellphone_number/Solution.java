package hide_cellphone_number;
class Solution {
	/*
	public String solution(String phone_number) {
	      String answer = "";
	      for(int i=0;i<phone_number.length();i++){
	    	  if(phone_number.length()-4>i)
	    		  answer += '*';
	    	  else if(phone_number.length()-4<=i){
	    		  answer += phone_number.charAt(i);
	    	  }
	    	  
	      }
	      return answer;
	  }*/
	public String solution(String phone_number) {
	     char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
	}
        
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	System.out.println(s.solution("01032825662"));
    	
    	
    }
}