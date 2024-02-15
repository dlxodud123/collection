package set;

import java.util.HashSet;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<>();
		Random rand = new Random();
//		for (int i = 0; arr.size() < 6; i++) {
//			int num = rand.nextInt(45)+1;
//			if (arr.contains(num) == false) {
//				arr.add(num);				
//			}
//		}
//		System.out.println(arr);
		HashSet<Integer> set = new HashSet<>();
		for (;set.size() < 6;) {
			int num = rand.nextInt(17)+1;
			set.add(num);
		}
		System.out.println(set);
	}
}	
