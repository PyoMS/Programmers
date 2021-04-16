package more_spicy;

import java.util.*;

public class Solution { //Heap
	public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> heap = new PriorityQueue<Integer>();
        
        for(int i : scoville){
        	heap.offer(i);
        }
        
        while(heap.size()>=1){
        	if(heap.size()==1){
        		if(heap.peek()>=K) return answer;
        		else return -1;
        	}
        	
        	int a = heap.poll();
        	if(a>=K) return answer;
        	int b = heap.poll();
        	
        	
        	heap.offer(cal(a,b));
        	
        	answer++;
        }
        return answer;
    }
	
	public int cal(int data1, int data2){
		return data1+(data2*2);
	}
	
	public static void main(String[] args){
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int k = 7;
		System.out.println(new Solution().solution(scoville, k));
	}
}