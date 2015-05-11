package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String answer1 = "안산";
		String answer2 = "광명";
		String answer3 = "드림엔터";
		
		System.out.println("양기현의 거주지는?");
		String answer = scanner.nextLine();
		
		if(answer.equals(answer1))
			System.out.println("정답입니다!");
		else
			System.out.println("틀렸습니다..");
		
		System.out.println("곽민석의 거주지는?");
		answer = scanner.nextLine();
		
		if(answer.equals(answer2))
			System.out.println("정답입니다!");
		else
			System.out.println("틀렸습니다..");
		
		System.out.println("욱재의 거주지는?");
		answer = scanner.nextLine();
		
		if(answer.equals(answer3))
			System.out.println("정답입니다!");
		else
			System.out.println("틀렸습니다..");
		
		scanner.close();

	}

}
