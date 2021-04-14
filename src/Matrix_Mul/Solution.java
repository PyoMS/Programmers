package Matrix_Mul;
class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        

        for(int i=0;i<arr1.length;i++){    
            for(int j=0;j<arr2[0].length;j++){  
                for(int k=0;k<arr2.length;k++){
                	answer[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        
        for(int i=0;i<arr1.length;i++){
        	for(int j=0;j<arr2[0].length;j++){  
       		 System.out.println("answer["+i+"]["+j+"] : " + answer[i][j]);
       		 
        	}
       }
        
        return answer;
    }
    
    public static void main(String[] args){
    	int[][] a = {{1,4,2},{3,2,4},{4,1,2}};
    	int[][] b = {{3,3,7},{3,3,1},{1,2,3}};
    	Solution s = new Solution();
    	System.out.println(s.solution(a, b));
    	
    }
}