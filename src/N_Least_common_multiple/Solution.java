package N_Least_common_multiple;
import java.util.*;
class Solution {

	public int solution(int[] arr) {
		int[] temp_arr = new int[2];
	      
		temp_arr[0] = arr[0];
	      for(int i= 1; i<arr.length ;i++){
	    	  temp_arr[1] = arr[i];
	    	  Arrays.sort(temp_arr);
	    	
	    	  for(int j=temp_arr[0];j>0;--j){
		    	  if(temp_arr[0]%j==0 && temp_arr[1]%j==0){
		    		  temp_arr[0] = j * temp_arr[0]/j * temp_arr[1]/j ;
		    		  break;
		    	  }
		      }
	      }
	      return temp_arr[0];
	  }
	
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[] arr = {2,3,12}; 
    			
    	System.out.println(s.solution(arr));
    	
    	
    }
}