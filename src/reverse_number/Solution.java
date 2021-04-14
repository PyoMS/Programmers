package reverse_number;

class Solution {
		public int[] solution(long n) {
	      String num = n+"";
	      int[] answer = new int[num.length()];
	      System.out.println(num.length());
	      for(int i=0;i<num.length();i++){
	    	  answer[i] = Integer.parseInt(num.charAt(num.length()-(i+1))+"");
	      }
	      return answer;
	  }
	  public static void main(String[] args){
		  Solution s = new Solution();
		  System.out.println(s.solution(123456));
		  
	  }
}