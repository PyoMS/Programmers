package LottoMaxMin;

import java.util.HashMap;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2]; // 최대 , 최소 저장 후 반환.
        HashMap<Integer,Integer> win_map = new HashMap<>();
        for (int i = 0; i < win_nums.length; i++) {
			win_map.put(win_nums[i], win_nums[i]);
		}
        int correct = 0;
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
        	if(lottos[i]==0){
				zero++;
				continue;
			}
        	else if(win_map.containsKey(lottos[i])){
        		correct++;
				continue;
			}
		}
        answer[0] = 7-(zero+(correct==0&&zero!=6?1:correct));
        answer[1] = 7-(correct==0?1:correct);
        System.out.println("answer[0] : " + answer[0]);
        System.out.println("answer[1] : " + answer[1]);
        return answer;
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] lottos = {0,0,0,0,0,0};
		int[] win_nums ={1,2,3,4,5,6};
		
		s.solution(lottos, win_nums);
		
	}
}
