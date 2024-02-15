package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		System.out.println("arr : " + arr);
		
		Iterator<String> it = arr.iterator();
		//System.out.println(it);
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		
		System.out.println("---------set----------");
		HashSet<String> set = new HashSet<>();
		set.add("111");
		set.add("222");
		set.add("333");
		
		System.out.println("set : " + set);
		it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("종료");
				
	}
}	
