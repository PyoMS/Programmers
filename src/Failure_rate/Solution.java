package Failure_rate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
	public int[] solution(int N, int[] stages) {
        double[] arr = new double[N+1]; //�������� �� ������
        ArrayList<Storage> list = new ArrayList<>();
		int stage_cnt = 0;
		//arr - stage�� ������ ����.
		for (int i =1; i <= N; i++) {
			for (int j = 0; j < stages.length; j++) {
				if(i <= stages[j]){
					arr[i]++; // �ش� ���忡 ���� or Ŭ���� ��.
					if(i==stages[j]) stage_cnt++;
				}
			}
			if(arr[i]==0){
				arr[i] = 0;
				Storage s = new Storage(i, arr[i]);
				list.add(s);
			}
			else{
				arr[i] = stage_cnt/arr[i];
				Storage s = new Storage(i, arr[i]);
				list.add(s);
				
			}
			stage_cnt = 0;
//			System.out.println(arr[i]);
		}

		Collections.sort(list, Collections.reverseOrder());
		
		int[] answer = new int[N];
		for (int i = 0; i < N; i++) {
			answer[i] = list.get(i).stage;
			System.out.println(answer[i]);
		}
        return answer;
    }
	
	public int[] swap(int N, double[] arr){
		int[] answer = new int[N+1];
		for (int i = 0; i < answer.length; i++) 
			answer[i] = i;
		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				if(arr[j]<arr[j+1]){
					double d_temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = d_temp;
					
					int temp = answer[j];
					answer[j] = answer[j+1];
					answer[j+1] = temp;
				}
			}
		}
		int[] ans = new int[N];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = answer[i+1];
//			System.out.println(ans[i]);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		//������ = �������� ���������� Ŭ���� ���� ���� �÷��̾� �� / ���������� ������ �÷��̾� ��
		int N = 5; //Stage�� ���� 1�̻� , 500����
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3}; 	// ����ڰ� ���� �����ִ� ���������� ��ȣ. 1�̻�. 200,000����
							// stages ���� 1 �̻� N+1 ������ �ڿ���. (N+1�� ������ �������� Ŭ������ ����)
		
		Solution s = new Solution();
		int[] answer = s.solution(N, stages);
		
	}
}

class Storage implements Comparable<Storage>{
	public int stage;
	public double failure;
	
	public Storage(int id, double failure) {
		this.stage = id;
		this.failure = failure;
	}

	@Override
	public int compareTo(Storage o) {
		if (failure < o.failure ) {
            return -1;
        }
        if (failure > o.failure ) {
            return 1;
        }
		return 0;
	}
	
	
}

