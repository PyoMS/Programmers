package printer;

import java.util.*;

public class Solution {
	class PrintData{
		public int priorities;
		public boolean myfile;
		public PrintData(int priorities){
			this.priorities = priorities;
			this.myfile = false;
		}
		public PrintData(){}
		
		@Override
	    public String toString() {
	        return "priorities : " + priorities + ", myfile : " + myfile;
	    }
	}
	public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<PrintData> PrintQ = new LinkedList<PrintData>();
        for (int i = 0; i < priorities.length; i++){
        	PrintData data = new PrintData(priorities[i]); 	
			if(i==location)	data.myfile = true;
//			System.out.println(data.toString());
			PrintQ.add(data);
			
		}
        while (!PrintQ.isEmpty()) {
        	int max = search_Max_prior(PrintQ);
        	PrintData p = PrintQ.poll();
        	if(p.priorities == max){
        		answer++;
        		if(p.myfile) break;
        	}
        	else{
        		PrintQ.offer(p);
        	}
		}
        
//        System.out.println("answer : " + answer);
        return answer;
    }
	public int search_Max_prior(Queue<PrintData> q){
//		System.out.println("search_Max_prior");
		Iterator<PrintData> it = q.iterator();
		int max = 0;
		while (it.hasNext()) {
			int temp = it.next().priorities;
			if(max<temp)
				max = temp;
		}
		return max;
	}
	public static void main(String[] args){
		int[] priorities = {2, 1, 3, 2};
//		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 2;
		new Solution().solution(priorities, location);
	}
}
