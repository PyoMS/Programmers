package player_who__has_not_finished;
import java.util.HashMap;;
class Solution {
    public String solution(String[] participant, String[] completion) {
    	String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        //초반에 키값과 value값을 판단.
        for(int i = 0; i < completion.length; i++){
            if(hm.containsKey(completion[i])){
                hm.put(completion[i], hm.get(completion[i])+1);
            }else{
                hm.put(completion[i], 1);
            }
        }
        
        for(int i = 0; i < participant.length; i++){
            if(hm.containsKey(participant[i])){
                if(hm.get(participant[i]) > 0){
                    hm.put(participant[i], hm.get(participant[i]) - 1);
                }else{
                    answer = participant[i];
                    break;
                }
            }else{
                answer = participant[i];
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args){
    	String[] par = {"leo", "kiki", "eden"};
    	String[] com = {"kiki", "eden"};
    	Solution s = new Solution();
    	System.out.println(s.solution(par, com));
    	
    }
}