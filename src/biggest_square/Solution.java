package biggest_square;

import java.util.Arrays;

class Solution {
	public int solution(int [][]board){
		
		int lengthX= board[0].length;
		int lengthY = board.length;
		int max = 0;
		
		if(lengthX < 2 || lengthY < 2){
			for(int i=0; i<lengthY; i++){
				for(int j=0; j<lengthX; j++){
					if(board[i][j]==1){
						max = 1;
					}
				}
			}
		}
		else{
			for(int i=1;i<lengthY;i++){
				for(int j=1;j<lengthX;j++){
					if(board[i][j]==1){
						board[i][j] = Math.min(board[i-1][j], board[i][j-1], board[i-1][j-1]) + 1;
						if(board[i][j]>max){
							max = board[i][j];
						}
					}
					
					
				}
			}
		}
		
        return max*max;
    }
	  public static void main(String[] args){
		  Solution s = new Solution();
		  int[][] board = { {0,1,1,1}, {1,1,1,1},{1,1,1,1},{0,0,1,0}};
		  System.out.println(s.solution(board));
	  }
}
class Math{
	public static int min(int a1, int a2, int a3){
		int[] arr = {a1, a2, a3};
		Arrays.sort(arr);
		return arr[0];
	}
}