package phone_number_list;

import java.util.*;

public class Solution {
	public boolean solution(String[] phone_book) {
		String[] arr = phone_book.clone();
        HashMap<String, Integer> map = new HashMap<>();
        for (String i :  phone_book) {
			map.put(i, i.hashCode());
			System.out.println(i +" : " + i.hashCode());
		}
        
//        for (int i = 0; i < phone_book.length; i++) {
//        	for (int j = 0; j < phone_book.length; j++) {
//				if(i!=j && compare(arr[j], arr[i])){
//					return false;
//				}
//			}
//		}
        return true;
    }
	public boolean compare(String str1, String str2){
		int subindex = str1.length();
		if(str1.length()>str2.length()) return false;
		String temp = str2.substring(0, subindex);
//		System.out.println("str1 : " + str1);
//		System.out.println("temp : " + temp);
		if(str1.equals(temp) || str1==temp) return true;
		
		return false;
	}
	public static void main(String[] args) {
//		String[] phone_book={"119", "97674223", "1195524421"};
//		String[] phone_book={"123","456","789"};
		String[] phone_book={"12","123","1235","567","88"};
//		String[] phone_book={"113333","115555","345555","555555", "345444"};
		
		System.out.println(new Solution().solution(phone_book));
		System.out.println("12 : "+"12".hashCode());
	}
}
