package com.javaex.basic.loop;

import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
				
		// 단 입력
		System.out.print("단을 입력하세요.");
		int dan;
		int i;
		dan = sc.nextInt();
		
		for (i = 1; i <= 9; i++) {
		// 1 ~ 9 반복
		// 결과 출력
			System.out.println(dan + "*" + i + "=" +(dan * i));	
		}		
		// 스캐너 닫기
		sc.close();
	}
}
