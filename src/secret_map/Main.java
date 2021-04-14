package secret_map;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
		}
		for (int i = 0; i < n; i++) {
			answer[i] = String.format("%" + n + "s", answer[i]);
			answer[i] = answer[i].replaceAll("1", "#");
			answer[i] = answer[i].replaceAll("0", " ");
        }
		
		/*
		for (int i = 0; i < n; i++) {
			String str1 = Integer.toBinaryString(arr1[i]);
			String str2 = Integer.toBinaryString(arr2[i]);
			
			while(str1.length()!=n){
				str1 = "0" + str1;
			}
			while(str2.length()!=n){
				str2 = "0" + str2;
			}
			
			String data = "";
			for (int j = 0; j < n; j++) {
				if((str1.charAt(j)==str2.charAt(j)) && str1.charAt(j)=='0'){
					data += ' ';
				}else{
					data += '#';
				}
			}
			answer[i] = data;
		}
		*/
		for (int i = 0; i < n; i++) {
			System.out.println(answer[i]);
		}
	}
}
