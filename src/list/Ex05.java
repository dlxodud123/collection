package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		for (int i = 0; i < 3; i++) {
			arr.add(sc.next());
		}
		System.out.println(arr);
		System.out.print("수정할 값 입력 : ");
		String a = sc.next();
		int index = arr.indexOf(a);
		
		System.out.print("수정할 문자 입력 : ");
		String c = sc.next();
		
		arr.set(index, c);
		arr.remove(2);
		System.out.println(arr);
		
	}
}
