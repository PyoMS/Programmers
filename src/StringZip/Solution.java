package StringZip;

class Solution {
    public int solution(String s) {
        int answer = 9999;
        StringBuffer sb = new StringBuffer();
        String temp = "";
        int cnt = 1;
        for (int i = 1; i <= s.length(); i++) {
        	for (int j = 0; j < s.length(); j+=i) {
        		if(j+i<=s.length()){
        			if(temp.equals(s.substring(j,j+i))){
        				if(1<cnt && cnt<10){
        					sb.delete(0, 1);
        					sb.insert(0, ++cnt);
        				}else if(10<=cnt && cnt<100){
        					sb.delete(0, 2);
        					sb.insert(0, ++cnt);
        				}else if(100<=cnt && cnt<1000){
        					sb.delete(0, 3);
        					sb.insert(0, ++cnt);
        				}
        				else if(1000<=cnt){
        					sb.delete(0, 4);
        					sb.insert(0, ++cnt);
        				}
        				else{
        					sb.insert(0, ++cnt);
        				}
        				
        			}else{
        				temp = s.substring(j,j+i);
        				cnt = 1;
        				sb.append(temp);
        			}
//        			System.out.println(temp);
        		}else{
        			sb.append(s.substring(j, s.length()));
        		}
			}
//        	System.out.println("sb : " + sb.toString());
        	if(answer>sb.length()){
        		answer = sb.length();
        	}
        	temp = "";
        	sb.setLength(0);
		}
        return answer;
    }
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	String s = ""; 
//    	s = "aabbaccc"; // 7 -> 2a2ba3c
//    	s = "ababcdcdababcdcd"; // 9 -> 2ab2cd2ab2cd -> 2ababcdcd
//    	s = "abcabcdede"; // 8 -> 2abcdede
//    	s = "abcabcabcabcdededededede"; // 14
//    	s = "xababcdcdababcdcd"; // 17
    	s = "aaaaaaaaaaaaaa"; 
    	System.out.println(sol.solution(s));
	}
}