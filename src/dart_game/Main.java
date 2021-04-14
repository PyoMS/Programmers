package dart_game;

public class Main {
	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		
		String regex = "[A-Z][*#]?";
		String[] split = new String[3];
		int cnt = 0;
		
		
		StringBuffer sb = new StringBuffer();
		sb.append(dartResult.charAt(0));
		for (int i = 1; i < dartResult.length(); i++) {
			if(('0'<=dartResult.charAt(i) && dartResult.charAt(i)<='9')){
				split[cnt++] = sb.toString();
				sb = new StringBuffer();
			}
			sb.append(dartResult.charAt(i));
		}
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
//		for (int i = 0; i < dartResult.length(); i++) {
//			if(('A'<=dartResult.charAt(i) && dartResult.charAt(i)<='Z') && dartResult.charAt(i)!='#'){
//				System.out.println(dartResult.substring(cnt, i+1));
//				cnt=i+1;
//			}
//		}
		
		
		/*
		int[] arr = new int[3];
		int arr_cnt = 0;
		int num = 0;
		for(int i=0; i<split.length;i++){
			if('0' <= dartResult.charAt(i) && dartResult.charAt(i) <= '9'){
				num = Integer.parseInt(dartResult.charAt(i)+"");
				i++;
			}
			switch(dartResult.charAt(i)){
				case 'S':
					arr[arr_cnt] = ((int) Math.pow(num, 1));
					i++;
					break;
				case 'D':
					arr[arr_cnt] = ((int) Math.pow(num, 2));
					i++;
					break;
				case 'T':
					arr[arr_cnt] = ((int) Math.pow(num, 3));
					i++;
					break;
			}
			if(i >=dartResult.length()) break;	
			if(dartResult.charAt(i)=='*'){
				if(arr_cnt==0){
					
					arr[arr_cnt] *=2;
				}else{
					arr[arr_cnt-1] *=2;
					arr[arr_cnt] *=2;
				}
				i++;
			}
			else if(dartResult.charAt(i) == '#'){
				arr[arr_cnt] *= -1;
				i++;
			}
			arr_cnt++;
			
		}
		*/
	}
}

