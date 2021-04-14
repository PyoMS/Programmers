package twoNumber_select;

import java.awt.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1}	;
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<numbers.length-1;i++){
            list.add(numbers[i]  + numbers[i+1]);
            
        }
        for(int i=0;i<list.size();i++){
        	System.out.println(list.get(i));
        }
	}
}
