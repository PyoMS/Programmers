package Correct_parenthesis;
class Solution {
/*
	boolean solution(String s) {
        int f_cnt=0;
        int l_cnt=0;
        if(s.charAt(0)==')')
        	return false;
        if(s.charAt(s.length()-1)=='(')
        	return false;
        for(int i=0;i<s.length();i++){
        	if(l_cnt>f_cnt){
        		return false;
        	}
        	if(s.charAt(i)=='('){
        		f_cnt++;
        	}
        	else if(s.charAt(i)==')'){
        		l_cnt++;
        	}
        	
        }
        if(l_cnt<f_cnt){
    		return false;
    	}
        return true;
    }*/
	 boolean solution(String s) {
	        boolean answer = false;
	        int count = 0;
	        for(int i = 0; i<s.length();i++){
	            if(s.charAt(i) == '('){
	                count++;
	            }
	            if(s.charAt(i) == ')'){
	                count--;
	            }
	            if(count < 0){
	                break;
	            }
	        }
	        if(count == 0){
	            answer = true;
	        }

	        return answer;
	    }
        
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	System.out.println(s.solution(")("));
    	
    	
    }
}