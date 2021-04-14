package DNA;
// 2차 배열. 
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
		arr = new String [n];	//문자열 수
		
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
	
	public static StringBuffer search_char(String[] arr){	// Max글자수(m), 총 데이터(n)
		StringBuffer sb = new StringBuffer();
		//각 문자열에서 같은 index에 있는 글자만 뽑아서 StringBuffer로 return
		for(int j=0;j<arr[0].length();j++){
			for(int i=0;i<arr.length;i++){
					sb.append(arr[i].charAt(j));
			}
		}
		return sb;
	}
	
	public static String Max_char(StringBuffer sb){
		//가장 많이 나온 글자 pick
		return "";
	}
}
