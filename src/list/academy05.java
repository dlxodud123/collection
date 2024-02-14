package list;

import java.util.ArrayList;
import java.util.Scanner;

public class academy05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		
		int func;
		while (true) {
			System.out.println("1. 연락처 등록\n2. 연락처 보기\n3. 연락처 삭제\n"
					+ "4. 모든 연락처 보기\n5. 종료");
			func = sc.nextInt();
			if (func == 1) {
				System.out.print("연락처 등록 : ");
				arr.add(sc.next());
			}else if (func == 2) {
				System.out.println(arr);
			}else if (func == 3) {
				
			}
			
		}
		
	}
}
