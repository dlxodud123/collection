package list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class academy03 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> s1 = new ArrayList<>();
		ArrayList<Integer> s2 = new ArrayList<>();
		ArrayList<Integer> s3 = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			arr.add(rand.nextInt(45)+1);
		}
		for (int i = 1; i <= 3; i++) {
			System.out.print(i+"번째 사람 로또 번호 입력 : ");
			for (int j = 0; j < arr.size(); j++) {
				if (i==1) {
					s1.add(sc.nextInt());
					if (j==5) {
						System.out.println(s1);
					}
				}else if (i==2) {
					s2.add(sc.nextInt());
					if (j==5) {
						System.out.println(s2);
					}
				}else {
					s3.add(sc.nextInt());
					if (j==5) {
						System.out.println(s3);
					}
				}
			}
		}
		int a=0, b=0, c=0;
		System.out.println("로또번호 => " + arr);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.contains(s1.get(i))) {
				a++;
			}if (arr.contains(s2.get(i))) {
				b++;
			}if (arr.contains(s3.get(i))) {
				c++;
			}
		}
		System.out.println("s1이 맞춘 개수 : " + a);
		System.out.println("s2이 맞춘 개수 : " + b);
		System.out.println("s3이 맞춘 개수 : " + c);
		int max = -1;
		if (a > b && a > c) {
			max = a;
			System.out.println("가장많이 맞춘 사람 : s1");
		}else if (b > a && b > c) {
			max = b;
			System.out.println("가장많이 맞춘 사람 : s2");
		}else if (c > a && c > b) {
			max = c;
			System.out.println("가장많이 맞춘 사람 : s3");
		}
	}
}	
