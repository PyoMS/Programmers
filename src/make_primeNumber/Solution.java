package make_primeNumber;


public class Solution {
	public int solution(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			max+=nums[i];
		}
		boolean[] arr = new boolean[max+1];
		for (int i = 2; i <= max; i++) {
			arr[i] = true;
		}
		for (int i = 2; i <= max; i++) {
			if(arr[i]){
				int num = i;
				for (int j = 2; j <= max; j++) {
					if(num*j>max) break;
					arr[num*j] = false;
				}
			}
			
		}
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if(arr[nums[i]+nums[j]+nums[k]]) result++;
				}
			}
		}
        System.out.println(result);
        return result;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		
		Solution s = new Solution();
		s.solution(nums);
		
	}
}
