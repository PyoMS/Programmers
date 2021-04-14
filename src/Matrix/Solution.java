package Matrix;
class Solution {
	 public int[][] solution(int[][] arr1, int[][] arr2) {
	      int[][] answer = new int[arr1.length][arr1[0].length];
	      
	      for(int i=0;i<arr1.length;i++){
	    	  for(int j=0;j<arr1[i].length;j++){
	    		  answer[i][j] = arr1[i][j] + arr2[i][j];
	    		  System.out.println("answer[i][j] : " + answer[i][j]);
	    		  System.out.println("i : "+ i+" j : " + j);
	    		  System.out.println(arr1[i][j] + arr2[i][j]);
	    	  }
	      }
	      
	      return answer;
	  }
    
    public static void main(String[] args){
    	int[][] a = {{1},{3}};
    	int[][] b = {{1},{2}};
    	Solution s = new Solution();
    	System.out.println(s.solution(a, b));
    	
    }
}