package new_id;

public class Solution {
	public static void main(String[] args) {
		String data = ".1.";
		StringBuffer answer = new StringBuffer();
		
		answer.append(data
				.toLowerCase() //1
				.replaceAll("[^a-z0-9-_.]", "") //2
				.replaceAll("(\\.){2,}", ".")) //3
				;
		
		if(answer.toString().startsWith(".")){ //4
			answer.deleteCharAt(0);
		}
		if(answer.toString().endsWith(".")){
			if(answer.length()>0) answer.deleteCharAt(answer.length()-1);
			else answer.deleteCharAt(0);
		}
		
		if(answer.length()==0) answer.append("a"); //5
		
		if(answer.length()>15){ //6
			answer.delete(15,answer.length());
			if(answer.toString().endsWith(".")){
				if(answer.length()>0) answer.deleteCharAt(answer.length()-1);
				else answer.deleteCharAt(0);
			}
		}
		while(answer.length()<3){ //7
			answer.append(answer.charAt(answer.length()-1)); 
		}
			
		System.out.println(answer.toString());
	}
}

