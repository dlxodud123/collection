package list;

import java.util.ArrayList;
import java.util.Random;

public class academy04 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		Random rand = new Random();
		
		for (int i = 0; i < 3; i++) {
			arr.add(rand.nextInt(9)+1);
			for (int j = 0; j < i; j++) {
				if (arr.get(i) == arr.get(j)) {
					i--;
				}
			}
		}
		System.out.println(arr);
	}
}
