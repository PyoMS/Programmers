package Ternary_system;

public class Solution {
	public static void main(String[] args) {
		int n = 125;
		int answer = 0;
		StringBuffer sb = new StringBuffer();
		answer = n;
		while(answer/3>0){
			sb.append(answer%3);
			answer = answer/3;
		}
		sb.append(answer%3);
		
		System.out.println(sb.toString());
		
		int res = 0;
		for (int i = 0; i < sb.length(); i++) {
			res += Integer.parseInt(sb.charAt(i)+"")* Math.pow(3, sb.length()-1-i);
		}
		
		System.out.println(res);
	}
}
