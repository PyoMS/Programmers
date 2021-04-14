package Expressed_as_N;


public class Solution {
	 public int solution(int N, int number) {
	        int answer = 0;
	        int num2 = number/11; //nn의 갯수이므로 answer에 넣을때는 *2 해주어야 한다.
	        int num = number%11; // n의 갯수
	    
	        answer = num2*2 + num + 1;
	        if(answer>8){
	            answer = -1;
	        }
	        return answer;
	    }
	public static void main(String[] args){
		Solution s = new Solution();
		System.out.println(s.solution(2, 11));
	}
}
