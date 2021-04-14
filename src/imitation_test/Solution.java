package imitation_test;

import java.util.*;
class Solution {
	public int[] solution(int[] answers) {
        ArrayList arr = new ArrayList();
        int[] answer = {0,0,0};
        
        int[] a = {1,2,3,4,5}; //5
        int[] b = {2,1,2,3,2,4,2,5}; //8
        int[] c = {3,3,1,1,2,2,4,4,5,5}; //10
        
        for(int i=0;i<answers.length;i++){
        	if(answers[i]==a[i%5]){
        		answer[0]++;
        	}
        	if(answers[i]==b[i%8]){
        		answer[1]++;
        	}
        	if(answers[i]==c[i%10]){
        		answer[2]++;
        	}
        }
        int max = answer[0];
        for(int i=1;i<3;i++){
        	if(max<=answer[i]){
            	max = answer[i];
            }
        }
      
        for(int i=0;i<3;i++){
        	if(answer[i]==max){
        		arr.add(i);
        		
        	}
        }
       
        int[] supoja = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
        	supoja[i] = Integer.parseInt(arr.get(i).toString())+1;
        	
        }
     
        
        return supoja;
    }
	public static void main(String[] args){
		  Solution s = new Solution();
		  int[] x = {1,2,3,4,5};
		  System.out.println(s.solution(x));
		  
	  }
}