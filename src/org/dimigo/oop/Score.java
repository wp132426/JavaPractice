package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		System.out.println("<< 점수 출력 >>");
		str.append("국어 점수 :").append(kor).append("수학 점수 : ").append(mat).append("영어 점수 : ").append(eng).append("총점 : ").append(eng+mat+kor).append("평균 : ").append(String.format("%.1f", (eng+mat+kor)/3.0));
		System.out.println(str);
		scanner.close();
	}

}
