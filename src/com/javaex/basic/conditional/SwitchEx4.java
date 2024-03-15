package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		
		// 점수 입력
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println("A등급");
		}
		else if(score >= 80) {
			System.out.println("B등급");
		}
		else if(score >= 70) {
			System.out.println("C등급");
		}
		else if(score >= 60) {
			System.out.println("D등급");
		}
		else {
			System.out.println("F등급");
		}
		
		//스캐너 닫기
		scanner.close();
	}

}