package stock_price;

import java.util.*;

class Solution {
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<Integer>();
        boolean is_f = true;
  
        for(int i : prices){
        	q.offer(i);
        }
        
        while(!q.isEmpty()){
        	int answer_index = prices.length - q.size();
        	int temp = q.poll();
        	
        	for(int i=0;i<q.size();i++){
        		
        		if(temp>q.peek() && is_f){
        			answer[answer_index] = i+1;
        			is_f =false;
        		}
        		
        		else if(is_f){
        			answer[answer_index] = q.size();
        		}
        		
        		q.offer(q.poll());
        	}
        	
        	is_f = true;
        }

        return answer;
    }
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[] prices = {498,501,470,489,654};
    	for(int i : s.solution(prices)){
    		System.out.println(i);
    	}
    }
}