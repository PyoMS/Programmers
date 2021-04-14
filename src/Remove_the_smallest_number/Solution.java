package Remove_the_smallest_number;
import java.util.*;
class Solution {
	 public int[] solution(int[] arr) {
	      int[] answer = {};
	      if(arr.length==1){
		    	  arr[0]=-1;
		    	  return arr;
		      }else{
		    	  answer = new int[arr.length-1];
		    	  int a=0;
		    	  int min=999;
		    	  int min_i = 0;
		    	  ArrayList<Integer> ar = new ArrayList<Integer>();
		    	  for(int i=0; i<arr.length;i++){
		    		  if(min>arr[i]){
		    			  min = arr[i];
		    			  min_i = i;
		    		  }
		    	  }
		    	  System.out.println("min : " + min);
		    	  for(int i=0; i<arr.length;i++){
		    		  if(i!=min_i){
		    			  ar.add(arr[i]);  
		    		  }
		    	  }
		    	  Iterator it = ar.iterator();
		    	  while(it.hasNext()){
		    		  answer[a++] = Integer.parseInt(it.next().toString());  
		    	  }
		      }
	      return answer;
	  }
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[] a = {5,2,3,4};
    	System.out.println(s.solution(a));
    	
    }
}