package list;

import java.util.ArrayList;
import java.util.Scanner;

public class academy07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1)+"번째 사람 이름 입력 : ");
			arr.add(sc.next());
		}
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).charAt(0) == '김') {
				System.out.println(arr.get(i));
				sum++;
			}
		}
		System.out.println(sum);
	}
}
