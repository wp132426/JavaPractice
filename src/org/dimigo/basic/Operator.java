package org.dimigo.basic;

public class Operator {
	
	public static void main(String[] args) {
		
		int a=9,b=10;
		float h1=5.8f,h2=5.4f;
		System.out.println("<< 도형 넓이 비교 >>");
		float s1 = ((a+b)*h1)/2;
		System.out.printf("사다리꼴 넓이 : %.1f\n",s1);
		float s2 = (a*h2);
		System.out.printf("평행사변형의 넓이 : %.1f\n",s2);
		
		System.out.println("사다리꼴이 평행사변형 보다 " + (s1-s2) + "더 큽니다");
		
	}

}
