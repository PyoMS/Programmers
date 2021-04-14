package truck_passing_the_bridge;
import java.util.*;
public class Solution {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		ArrayList<Truck> done_list = new ArrayList<>();
		ArrayList<Truck> crossing_list = new ArrayList<>();
		
        int cnt = 0; int i =0;
        int currentWeightSum = 0;
        
        while(done_list.size() != truck_weights.length){
        	System.out.println("cnt : " + cnt);
        	cnt++;
        	//weight
        	if(i<truck_weights.length){
        		if(weight >= currentWeightSum + truck_weights[i]){
            		Truck t = new Truck(truck_weights[i], 0);
            		currentWeightSum += t.weight;
            		crossing_list.add(t);
            		i++;
            	}
        	}
        	
        	//distance
        	for (int j = 0; j < crossing_list.size(); j++) {
        		crossing_list.get(j).duringDistance++;
        		if(bridge_length < crossing_list.get(j).duringDistance){
        			currentWeightSum -= crossing_list.get(j).weight;
            		done_list.add(crossing_list.get(j));
            		crossing_list.remove(j);
            	}
			}
		}
        
        System.out.println(cnt);
        return cnt;
    }
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights ={7,4,5,6};
		new Solution().solution(bridge_length, weight, truck_weights);
	}
}
class Truck{
	public int weight;
	public int duringDistance;
	
	Truck(int weight, int duringDistance){
		this.weight = weight;
		this.duringDistance = duringDistance;
	}
}
//class Traffic_Bridge{
//	public int current_weight;
//	public int 
//}
