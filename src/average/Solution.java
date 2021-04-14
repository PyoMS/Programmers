package average;

public class Solution {
	public double solution(int[] arr) {
	      double answer = 0;
	      
	      //foreach문 -> 해당 인덱스에 관한 값을 단순히 i로만 명시해줘도 arr[i]로 인식한다.
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
