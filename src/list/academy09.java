package list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class academy09 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> brr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("랜덤 값의 범위 지정 : ");
		int size = sc.nextInt();
		System.out.print("랜덤 값 발생 횟수 지정 : ");
		int time = sc.nextInt();
		for (int i = 0; i < time; i++) {
			arr.add(rand.nextInt(size)+1);
		}
		for (int i = 0; i < arr.size(); i++) {
			String s = arr.get(i) + "";
			System.out.print(s.charAt(0));
		}
		System.out.println();
		System.out.println(arr);
	}
}
