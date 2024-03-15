package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileGugu {

	public static void main(String[] args) {
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		
		// 단 입력 받기
		System.out.print("단을 입력하세요:");
		int dan;
		int i = 1;
		
		dan = scanner.nextInt();
		
		// 1 ~ 9까지 while loop
		//		단 * num 출력
		while(i <= 9) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
			i += 1;
		}
		
		// 스캐너 닫기
		scanner.close();
	}

}
