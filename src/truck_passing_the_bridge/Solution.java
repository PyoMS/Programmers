package truck_passing_the_bridge;
import java.util.*;
public class Solution {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Truck> wait_list = new LinkedList<>();
		Queue<Truck> crossing_list = new LinkedList<>();
        int cnt = 0; int i =0;
        int currentWeightSum = 0;
        
        for (int j : truck_weights) {
        	wait_list.offer(new Truck(j));
		}
        
        while(!wait_list.isEmpty() || !crossing_list.isEmpty()){
        	cnt++;
//        	System.out.println("cnt : " + cnt);
        	
        	//distance
        	if(crossing_list.isEmpty()){
        		crossing_list.offer(wait_list.poll());
        		currentWeightSum += crossing_list.peek().weight;
        		continue;
        	}
        	for (Truck j : crossing_list) {
				j.duringDistance++;
			}
        	// out
        	if(crossing_list.peek().duringDistance>bridge_length){
        		currentWeightSum -= crossing_list.poll().weight;
        	}
        	//in
        	if(!wait_list.isEmpty() && (currentWeightSum + wait_list.peek().weight <= weight)){
        		crossing_list.offer(wait_list.poll());
        		currentWeightSum += crossing_list.peek().weight;
        	}
        	
		}
        
        System.out.println(cnt);
        return cnt;
    }
	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
//		int[] truck_weights = {7,4,5,6};
		int[] truck_weights ={10,10,10,10,10,10,10,10,10,10};
//		int[] truck_weights ={10};
		new Solution().solution(bridge_length, weight, truck_weights);
	}
}
class Truck{
	public int weight;
	public int duringDistance;
	
	public Truck(int weight){
		this.weight = weight;
		this.duringDistance = 1;
	}
	public void move(){
		duringDistance++;
	}
	
}
