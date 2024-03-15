package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		
		// 과목번호 입력받기
		System.out.print("과목번호를 입력하세요." + System.lineSeparator() + "(1.자바 2.C 3.C++ 4.파이썬)");
		int subj = scanner.nextInt();
		
		// 조건분기 (switch)
		switch (subj) {
		case 1: // subj == 1
			System.out.println("R101호입니다.");
			break;
		case 2: // subj == 2
			System.out.println("R202호입니다.");
			break;
		case 3: // subj == 3
			System.out.println("R303입니다.");
			break;
		case 4: // subj == 4
			System.out.println("R404호입니다.");
			break;
		default: // else
			System.out.println("상담원에게 문의하세요.");
			break;
		}
		
		// 스캐너 닫기
		scanner.close();
	}

}
