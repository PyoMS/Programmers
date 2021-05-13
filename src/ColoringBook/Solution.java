package ColoringBook;

class Solution {
	private boolean[][] checkArr;
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        this.checkArr = new boolean[m][n];
        
        int[] answer = new int[2];
        for (int i = 0; i < m; i++) 
			for (int j = 0; j < n; j++) 
				if(picture[i][j]==0)
					checkArr[i][j] = true;
		
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(!this.checkArr[i][j]){
					int cnt = count(m, n, i, j, picture, picture[i][j]);
					if(cnt>0) numberOfArea++;
					if(maxSizeOfOneArea<cnt) maxSizeOfOneArea = cnt;
				}
			}
		}
        
        answer[0] = numberOfArea; // 영역 수
        answer[1] = maxSizeOfOneArea; // 영역중 최대 넓이.
        System.out.println("answer[0] : " + answer[0]);
        System.out.println("answer[1] : " + answer[1]);
        return answer;
    }
    
    private int count(int m, int n, int i, int j, int[][] picture, int color){
    	
    	if(m<=i || n<=j || i<0 || j<0 || picture[i][j]!= color || checkArr[i][j]) return 0;
		checkArr[i][j] = true;
    	return 1 
    			+ count(m,n, i+1,j, picture, color)
    			+ count(m,n, i-1,j, picture, color)
    			+ count(m,n, i,j+1, picture, color)
    			+ count(m,n, i,j-1, picture, color);
    }
    
    public static void main(String[] args) {
		Solution s =new Solution();
		int m = 6; int n = 4;
		int[][] picture = {
				{1, 1, 1, 0}, 
				{1, 2, 2, 0}, 
				{1, 0, 0, 1}, 
				{0, 0, 0, 1}, 
				{0, 0, 0, 3}, 
				{0, 0, 0, 3}
				};
		s.solution(m, n, picture);
	}
}
