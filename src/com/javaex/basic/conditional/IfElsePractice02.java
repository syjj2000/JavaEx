package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("과목을 선택하세요" + System.lineSeparator() + "(1.자바 2.C 3.C++ 4.파이썬)");
		
		System.out.print(System.lineSeparator()+"과목번호:");
		int code = scanner.nextInt();
		
		if (code == 1) {
			System.out.println("R101호 입니다.");
		}
		else if (code == 2) {
			System.out.println("R202호 입니다.");
		}
		else if(code == 3){
			System.out.println("R303호 입니다.");
		}
		else if(code == 4){
			System.out.println("R404호 입니다.");
		}
		else {
			System.out.println("상담원에게 문의하세요");
		}
	}

}
