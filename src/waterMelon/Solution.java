package waterMelon;

//���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution��
//�ϼ��ϼ���. ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
class Solution {
	
	  public String solution(int n) {
		  int cnt=0;
	      String answer = "";
	      
	      while(!(n==cnt)){
	    	  cnt++;
	    	  System.out.println(cnt);
	    	  if(cnt%2 == 0){
	    		  answer+="��";
	    	  }else if(cnt%2 ==1){
	    	
	    		  answer+="��";
	    	  }
	      }
	      return answer;
	  
	  }
	  public static void main(String[] args){
		  Solution s = new Solution();
		  System.out.println(s.solution(3));
	  }
}