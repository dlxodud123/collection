package map;

import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("num", 100);
		map.put("age", 10);
		System.out.println("map : " + map);
		System.out.println(map.get("num"));
		System.out.println(map.get("age"));
		System.out.println(map.get("없는값"));
		
		System.out.println(map.containsKey("age"));
		System.out.println(map.containsValue(2000));
		
		map.put("age", 100);
		System.out.println(map);
		map.remove("age");
		System.out.println(map);
	}
}
