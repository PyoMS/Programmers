package function_development;
import java.util.*;

public class Solution {
	class Process{
		public int progress;
		public int speeds;
		public boolean done;
		public Process(){}
		
		public Process(int progress, int speeds){
			this.progress = progress;
			this.speeds = speeds;
			this.done = false;
		}
	}
	public int[] solution(int[] progresses, int[] speeds) {
        Queue<Process> queue = new LinkedList<Process>();
        for (int i = 0; i < progresses.length; i++) {
        	Process p = new Process(progresses[i], speeds[i]);
        	queue.offer(p);
		}
        int count = 0;
        boolean isFirst = false;
        Queue<Integer> tempQ = new LinkedList<Integer>();
        while (!queue.isEmpty()) {
        	int size = queue.size();
//        	System.out.println("size : "+size);
        	//check
        	for (int i = 0; i < size; i++) {
        		Process p = queue.poll();
        		if(!p.done){
        			p.progress += p.speeds;
        		}
    			if(p.progress>=100){
        			p.done = true;
        			if(i==0) isFirst = true;
        		}
        		queue.offer(p);
        	}
        	
        	for (int i = 0; i < size; i++) {
        		Process p = queue.poll();
        		if(isFirst&&p.done){
        			count++;
        			if(!queue.isEmpty()){
        				if(!queue.peek().done) isFirst =false;
        			}
        		}
        		else{
        			queue.offer(p);
        		}
			}
        	if(count!=0){
				tempQ.offer(count);
    			count=0;
    		}
		}
        int[] answer = new int[tempQ.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = tempQ.poll();
		}
        return answer;
    }
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55}; // 7 9
		int[] speeds = {1, 30, 5};
//		int[] progresses = {95, 90, 99, 99, 80, 99}; // 5 10 20 일 순으로 모든 작업 종료.
//		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] res = new Solution().solution(progresses, speeds);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
