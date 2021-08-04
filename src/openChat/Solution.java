package openChat;
import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> inform = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < record.length; i++) {
        	String[] temp = record[i].split(" ");
        	if(temp[0].equals("Enter")){
            	inform.put(temp[1], temp[2]);
        	}
        	else if(temp[0].equals("Change")){
            	inform.put(temp[1], temp[2]);
        	}
        	
		}
        for (int i = 0; i < record.length; i++) {
        	StringBuffer sb = new StringBuffer();
        	String[] temp = record[i].split(" ");
        	if(temp[0].equals("Enter")){
        		sb.append(inform.get(temp[1])).append("´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
            	list.add(sb.toString());
        	}
        	else if(temp[0].equals("Leave")){
        		sb.append(inform.get(temp[1])).append("´ÔÀÌ ³ª°¬½À´Ï´Ù.");
        		list.add(sb.toString());
        	}
        	System.out.println(sb.toString());
		}
        String[] answer = new String[list.size()];
        
        return list.toArray(answer);
    }
    public static void main(String[] args) {
    	Solution s =new Solution();
    	String[] record = {"Enter uid1234 Muzi", 
    			"Enter uid4567 Prodo",
    			"Leave uid1234",
    			"Enter uid1234 Prodo",
    			"Change uid4567 Ryan"};
    	s.solution(record);
    	
	}
}