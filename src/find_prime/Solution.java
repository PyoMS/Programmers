package find_prime;

class Solution {

	public int solution(int n) {
		int answer = 0;
		boolean[] isprime = null;
		isprime = new boolean[n];

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isprime[i] = true;
				}
			}
			if (isprime[i] == false) {
				for (int a = i * 2; a <= n; a += i) {
					isprime[a] = true;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(10));

	}
}