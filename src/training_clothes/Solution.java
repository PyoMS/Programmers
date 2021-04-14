package training_clothes;

import java.util.*;

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int student[] = new int[n];
        int a = 0;
        for(int i=0; i<student.length;i++){
            student[i] = 1;
        }
        for(int i=0; i<lost.length;i++){
            student[lost[i]-1]--;
        }
        for(int i =0; i<reserve.length;i++){
            student[reserve[i]-1]++;
        }
        //student�� ���� : 1) ���� ����, 2) �������� �絵 ����, 0)�޾ƾ��ϴ� ����
        for(int i=0; i<student.length;i++){
//        	System.out.println(student[i]);
            if(student[i]==0){
                if(a==1){
                     student[i-1]--;
                      student[i]++;
                      a = 0;
                }
                else{
                    a = 2;	//a=2 ü������ �ʿ���ϴ� ����
                }
            }
            else if(student[i]==1){
                a = 0; //a=0 �ƹ��ϵ� �Ͼ�� �ʴ� ����
            }
            else{
                if(a==2){
                    student[i-1]++;
                    student[i]--;
                    a=0;
                }
                else {
                      a = 1;
                } 
            }
        }
        for(int i=0; i<student.length;i++){
            if(student[i]>=1){
                answer++;
            }
        }
        return answer;
    }

    
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[] lost = {2,3,4};
    	int[] reserve = {3,4,5};
    	System.out.println(s.solution(5, lost, reserve));
    	
    }
}