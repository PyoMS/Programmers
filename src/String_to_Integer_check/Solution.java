package String_to_Integer_check;

public class Solution {
	public boolean solution(String s){

		 if((s.length()==4 || s.length()==6)){
			 for(int i=0;i<s.length();i++){
					if(!(s.charAt(i)>=48 && s.charAt(i)<=57)){
						return false;
					}
			}
			 return true;
		 }
		return false;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		System.out.println(s.solution("58765"));
	}
}
