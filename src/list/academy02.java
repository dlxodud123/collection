package list;

import java.util.ArrayList;
import java.util.Scanner;

public class academy02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String grade1 = "1등급";
		System.out.print("이름과 성정 입력 : ");
		arr.add(grade1);
		for (int i = 0; i < 3; i++) {
			arr.add(sc.next());
		}
		System.out.println(arr);
	}
}
