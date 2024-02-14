package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.print("배열 사이즈 입력 : ");
		int size = sc.nextInt();
		int sum = 0;
		System.out.print("값 입력 : ");
		for (int i = 0; i < size; i++) {
			arr.add(sc.nextInt());
			sum += arr.get(i);
		}
		int avg = sum / arr.size();
		arr.sort(Comparator.naturalOrder());
		System.out.println(arr);
	
		if (arr.size()%2==1) {
			System.out.println(arr.get((arr.size()/2)));
		}else {
			int m1 = arr.get(arr.size()/2-1), m2 = arr.get(arr.size()/2);
			int result = (m1 + m2)/2;
			System.out.println(result);
			
		}
	}
}
