package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		int func, choice, mmoney;
		String remove, modify;
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		while (true) {
			System.out.print("1.메뉴 등록\n2.메뉴별 가격 보기\n3.종 료\n>>> ");
			func = sc.nextInt();
			if (func == 1) {
				System.out.print("메뉴 입력 : ");
				String menu = sc.next();
				System.out.print("가격 입력 : ");
				int price = sc.nextInt();
				map.put(menu, price);
			}else if (func == 2) {
				while (true) {
					Set<String> set = map.keySet();       // !!!!!!!!!
					Iterator<String> it = set.iterator(); // !!!!!!!!!
					while (it.hasNext()) {                // !!!!!!!!!
						String key = it.next();
						System.out.println(key + " : " + map.get(key));
					}
					System.out.print("1.수정 2.삭제 3.나가기\n>>> ");
					choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("수정할 메뉴를 선택해주세요");
						modify = sc.next();
						if (map.containsKey(modify)) {
							System.out.print("수정 가격 입력 : ");
							mmoney = sc.nextInt();
							map.put(modify, mmoney);
							System.out.println("수정되었습니다.");
						}else {
							System.out.println("해당 메뉴가 없습니다");
						}
						
					}else if (choice == 2) {
						System.out.println("삭제할 메뉴를 선택해주세요");
						remove = sc.next();
						if (map.containsKey(remove)) {
							map.remove(remove);
							System.out.println("삭제되었습니다");
						}else {
							System.out.println("해당 메뉴가 없습니다");
						}
						
					}else if (choice == 3) {
						System.out.println("나가기 선택");
						break;
						
					}else {
						System.out.println("1 ~ 3번으로 다시 선택해주세요");
					}
				}
				
			}else if (func == 3) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("1 ~ 3사이의 숫자를 입력해주세요.");
			}
		}
	}
}	
