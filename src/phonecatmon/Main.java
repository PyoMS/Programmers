package phonecatmon;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		int N = nums.length/2;
		
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		
		System.out.println(set.size() > N ? N : set.size());
	}
}
