package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<String>  arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i+1 + ".번째 메뉴 등록 : ");
			arr.add(sc.next());
		}
		System.out.println("===등록된 메뉴===");
		System.out.println(arr);
		System.out.println("==============");
		System.out.print("수정할 메뉴 입력 : ");
		String search = sc.next();
		System.out.println(arr.contains(search));
		System.out.println(arr.indexOf(search));
		System.out.println("===============");
		int index = arr.indexOf(search);
		if (index != -1) {
			System.out.print("수정할 이름 이력 : ");
			String change = sc.next();
			System.out.println(arr.get(index)+" => " + change);
			arr.set(index, change);
			System.out.println("수정 후 arr : " + arr);
		}else {
			System.out.println("존재하지 않는 메뉴는 수정 불가");
		}
	}
}
