package Press_the_keypad;


public class Solution {
	public String solution(int[] numbers, String hand){
//		String[][] keypad = {
//				{"1","2","3"}, // [0][0] [0][1] [0][2]
//				{"4","5","6"}, // [1][0] [1][1] [1][2]
//				{"7","8","9"}, // [2][0] [2][1] [2][2]
//				{"*","0","#"}};// [3][0] [3][1] [3][2]
		int[] L_P = new int [2];
		int[] R_P = new int [2];
		int[] M_P = new int [2];
		L_P[0] = 3; L_P[1] = 0; //*
		R_P[0] = 3; R_P[1] = 2; //#
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < numbers.length; i++) {
			switch(numbers[i]){
				case 2: case 5: case 8: case 0:
					M_P[0]=0;  M_P[1]=1;
					if(distance(L_P, M_P) < distance(R_P, M_P)){
						sb.append("L");
						L_P[0] = M_P[0];
						L_P[1] = M_P[1];
					}
					else if(distance(L_P, M_P) > distance(R_P, M_P)){
						sb.append("R");
						R_P[0] = M_P[0];
						R_P[1] = M_P[1];
					}
					else{
						if(hand.equals("right")||hand=="right"){
							sb.append("R");
							R_P[0] = M_P[0];
							R_P[1] = M_P[1];
						}else{
							sb.append("L");
							L_P[0] = M_P[0];
							L_P[1] = M_P[1];
						}
					}
					break;
					
				case 1: case 4: case 7:
					sb.append("L");
					L_P[0] = 0; L_P[1] = 0;
					break;
					
				case 3: case 6: case 9:
					sb.append("R");
					R_P[0] = 0; R_P[1] = 2;
					break;
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	public int distance(int[] a, int[] b){
		int result = Math.abs(a[0]-b[0]) + Math.abs(a[1]-b[1]);
		return result;
	}
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		Solution s = new Solution();
		s.solution(numbers, hand);
		
	}
}
