package more_spicy;

public class Solution { //Heap
	public int solution(int[] scoville, int K) {
        int answer = 0;
        int arr[] = sort(scoville);
        for (int i = 0; i < scoville.length; i++) {
        	
		}
        while(true){
        	if(K<arr[0]) break;
        	int f_s = arr[0];
        	System.out.print("f_s : " + f_s+" ");
        	int s_s = arr[1];
        	System.out.println("s_s : " + s_s);
        	arr = array_cal(arr, f_s+(s_s*2));
        	
        	answer++;
        }
        System.out.println(answer);
        return answer;
    }
	
	public int[] sort(int[] scoville){
		int[] arr = scoville.clone();
		for (int i = arr.length-1; i > 0 ; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public int[] array_cal(int[] arr, int data){
		int[] temp = new int[arr.length-1];
		
		for (int i = 2; i < arr.length; i++) {
			temp[i-2] = arr[i]; 
		}
		temp[temp.length-1] = data;
		return sort(temp);
	}
	
	public static void main(String[] args){
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int k = 7;
		new Solution().solution(scoville, k);
	}
}
