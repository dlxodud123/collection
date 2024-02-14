package list;

import java.util.ArrayList;
import java.util.Random;

public class academy08 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < i; j++) {
				arr.add(rand.nextInt(20)+1);
				if (arr.get(i) == arr.get(j)) {
					i--;
					break;
				}
			}
		}
		System.out.println(arr);
	}
}
