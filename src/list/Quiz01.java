package list;

import java.util.ArrayList;
import java.util.Random;

public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			arr.add(rand.nextInt(45)+1);
			for (int j = 0; j < i ; j++) {
				if (arr.get(i) == arr.get(j)) {
					i--;
					break;
				}
			}
		}
		System.out.println(arr);
		
		int temp;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (arr.get(i) < arr.get(j)) {
					temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
		System.out.println(arr);
	}
}
