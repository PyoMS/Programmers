package average;

public class Solution {
	public double solution(int[] arr) {
	      double answer = 0;
	      
	      //foreach�� -> �ش� �ε����� ���� ���� �ܼ��� i�θ� ������൵ arr[i]�� �ν��Ѵ�.
	      for (int i : arr) {
	    	  answer += i;
	      }
//	      for(int i=0;i<arr.length;i++){
//	    	  answer += arr[i];
//	      }
	      answer /= arr.length;
	      return answer;
	 }
	public static void main(String[] args){
		Solution s = new Solution();
		int x[] = {3,4,5};
		System.out.println(s.solution(x));
	}
}
