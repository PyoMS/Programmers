package K_number;

import java.util.Arrays;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        /*
        for(int a=0;a<commands.length;a++){
        	int i = commands[a][0]; 
        	int j = commands[a][1]; 
        	int k = commands[a][2]; 
        	int length = j - i + 1;

        	int[] temp = new int[length];
        	
        	for(int b=0;b<length;b++){
        		temp[b] = array[b+(i-1)];
        	}
        	Arrays.sort(temp);
        	answer[a] = temp[k-1];
        	
        }
        */
        for(int i=0;i<commands.length;i++){
        	int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        
        return answer;
    }
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[] array = {1,5,2,6,3,7,4};
    	int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3} };
    	System.out.println(s.solution(array, commands));
    	
    }
}