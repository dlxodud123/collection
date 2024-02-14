package list;

import java.util.ArrayList;
import java.util.Scanner;

public class academy01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.print("몇개 : ");
		int size = sc.nextInt();
		System.out.print("입력 : ");
		for (int i = 0; i < size; i++) {
			arr.add(sc.nextInt());
		}
		int max = arr.get(0), min =arr.get(0);
		for (int i = 0; i < 5; i++) {
			if (max < arr.get(i)) {
				max = arr.get(i);
			}if (min > arr.get(i)) {
				min = arr.get(i);
			}
		}
		System.out.println(max+", "+min);
		
		

		
	}
}
