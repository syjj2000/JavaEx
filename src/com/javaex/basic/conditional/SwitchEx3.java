package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		
		// 점수 입력
		System.out.print("점수를 입력하세요: ");
        int number = scanner.nextInt();

        if (isMultipleOf3(number)) {
            System.out.println(number + "은(는) 3의 배수입니다.");
        } else {
            System.out.println(number + "은(는) 3의 배수가 아닙니다.");
        }
        // 스캐너 닫기
        scanner.close();
    }

    public static boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

}
