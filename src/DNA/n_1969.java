package DNA;
// 2�� �迭. 
import java.util.*;
/*
5 8
TATGATAC
TAAGCTAC
AAAGATCC
TGAGATAC
TAAGATGT
--------
TAAGATAC
7
*/
public class n_1969 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String[] arr = null;
		arr = new String [n];	//���ڿ� ��
		
//		System.out.println(arr.length);	//n
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextLine();
			
//			System.out.println(i);
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		
		sc.close();
	}
	
	public static StringBuffer search_char(String[] arr){	// Max���ڼ�(m), �� ������(n)
		StringBuffer sb = new StringBuffer();
		//�� ���ڿ����� ���� index�� �ִ� ���ڸ� �̾Ƽ� StringBuffer�� return
		for(int j=0;j<arr[0].length();j++){
			for(int i=0;i<arr.length;i++){
					sb.append(arr[i].charAt(j));
			}
		}
		return sb;
	}
	
	public static String Max_char(StringBuffer sb){
		//���� ���� ���� ���� pick
		return "";
	}
}
