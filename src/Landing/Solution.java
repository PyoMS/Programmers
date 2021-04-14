package Landing;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
	int solution(int[][] land) {
        int answer = 0;
    	
        ArrayList<Integer> arr[] = new ArrayList[land.length];
  
    	for(int i=0;i<land.length;i++){
    		arr[i] = new ArrayList<Integer>();
        	for(int j=0;j<land[i].length;j++){
        		arr[i].add(land[i][j]);
        	}
        }
    	for(int i=0;i<land.length;i++){
    		if(i!=land.length-1){
    			if(Maxindex(arr[i]) == Maxindex(arr[i+1])){
        			if(secondMaxindex(arr[i])- Maxindex(arr[i]) > secondMaxindex(arr[i+1])- Maxindex(arr[i+1]) ){
        				answer += arr[i].get(Maxindex(arr[i]));
        				System.out.println("arr[i].get(Maxindex(arr[i])) : " + arr[i].get(Maxindex(arr[i])));
        			}else{
        				answer += arr[i].get(secondMaxindex(arr[i]));
        				System.out.println("arr[i].get(secondMaxindex(arr[i])) : " + arr[i].get(secondMaxindex(arr[i])));
        			}
        		}
    		}
    		else{
    			answer += arr[i].get(Maxindex(arr[i]));
    		}

        }
        

        return answer;
    }
	public int Maxindex(ArrayList<Integer> intArray){
		int largest = intArray.get(0); 
	    int maxIndex = 0; 
	    for(int i = 0; i < intArray.size() ; i++){ 
	    	if(largest < intArray.get(i)){	     
	    		largest = intArray.get(i); 
	    		maxIndex = i; 
	    	} 
	    } 

	    return maxIndex; 
	}
	
	public int secondMaxindex(ArrayList<Integer> intArray){
		int largest = intArray.get(0); 
	    Integer largest2 = null; 
	    int maxIndex = 0; 
	    int maxIndex2 = 0; 

	    for(int i = 0; i < intArray.size() ; i++)
	    { 
	     if(largest < intArray.get(i))
	     { 
	      largest2 = largest; 
	      maxIndex2 = maxIndex; 
	      largest = intArray.get(i); 
	      maxIndex = i; 
	     } 
	     else if(largest2 == null || intArray.get(i) > largest2)
	    	 
	     { 
	    	 largest2 = intArray.get(i); 
	    	 maxIndex2 = i; 
	     } 
	    }

	    return maxIndex2; 
	}
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
    	System.out.println(s.solution(land));
    	
    }
}