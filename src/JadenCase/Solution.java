package JadenCase;

class Solution {
	public String solution(String s) {
		boolean isNextUpper = true;
	    StringBuffer sb = new StringBuffer();
	 
	    for ( int i=0; i<s.length(); i++ ) {
	      char c = s.charAt(i);
	      if ( i == 0 || isNextUpper ) {
	        sb.append(Character.toUpperCase(c));
	        isNextUpper = false;
	      } else {
	        sb.append(Character.toLowerCase(c));
	      }
	 
	      if ( c == ' ') {
	        isNextUpper = true;
	      }
	    }
	    return sb.toString();
	  }
	  public static void main(String[] args){
		  Solution s = new Solution();
		  System.out.println(s.solution("3 u m"));
	  }
}