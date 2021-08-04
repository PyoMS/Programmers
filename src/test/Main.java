package test;

import java.util.ArrayList;
import java.util.Hashtable;

public class Main {
	public static void main(String[] args) {
		Hashtable table = new Hashtable<>();
		ArrayList list = new ArrayList<>();
		String temp = "test";
		list.add(1);
		list.add(2);
		list.add(3);
		table.put("1", temp);
		table.put("2", list);
		
		System.out.println(table.get("1"));
		System.out.println(table.get("2"));
	}
}
