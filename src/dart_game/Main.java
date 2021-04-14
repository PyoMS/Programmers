package dart_game;

public class Main {
	public static void main(String[] args) {
		String dartResult = "1T2D3D#";
//		String[] arrTemp = dartResult.split("");  //문자열을 String 배열에 각각 저장.
		int[] arr = new int[3];
		int arr_cnt = 0;
		int num = 0;
		for(int i=0; i<dartResult.length();i++){
			if('0' <= dartResult.charAt(i) && dartResult.charAt(i) <= '9'){
				if(dartResult.charAt(i)=='1' && dartResult.charAt(i+1)=='0'){
					num = 10;
					i++;
				}
				else num = Integer.parseInt(dartResult.charAt(i)+"");
			}
			switch(dartResult.charAt(i)){
				case 'S':
					System.out.println("num_S : "+num);
					arr[arr_cnt] = ((int) Math.pow(num, 1));
					break;
				case 'D':
					System.out.println("num_D : " + num);
					arr[arr_cnt] = ((int) Math.pow(num, 2));
					break;
				case 'T':
					System.out.println("num_T : " + num);
					arr[arr_cnt] = ((int) Math.pow(num, 3));
					break;
			}
			if(i!=dartResult.length()-1){
				if(dartResult.charAt(i+1)=='*'){
					if(arr_cnt==0){
						arr[arr_cnt] *=2;
					}else{
						arr[arr_cnt-1] *=2;
						arr[arr_cnt] *=2;
					}
				}
				else if(dartResult.charAt(i+1) == '#'){
					arr[arr_cnt] *= -1;
				}
			}
			else if(i==dartResult.length()-1) break;
//			System.out.println("arr_cnt : " + arr_cnt+", i : " + i);
			
			if(arr[arr_cnt]!=0)	arr_cnt++;
			
		}
		//1S*2T*3S
		System.out.println(arr[0]+arr[1]+arr[2]);
	}
}

