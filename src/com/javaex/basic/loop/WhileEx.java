package com.javaex.basic.loop;

public class WhileEx {
	// I like Java0 ~ I like Java 20
	public static void main(String[] args) {
		// while 반복문
		// 조건을 반복하는 동안 블록 반복
		// 반복 조건 제어 변수 필요, 조건 변수를 개발자가 직접 제어
		int num = 0;
		
		while (num <=20) {
			System.out.println("I like Java" + num);
			num += 1;
		}
	}

}
