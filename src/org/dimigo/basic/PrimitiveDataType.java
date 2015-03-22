package org.dimigo.basic;

public class PrimitiveDataType {
	
	public static void main(String[]args) {
		
		String name = "아이유";
		String gender;
		boolean female = true;
		int age = 23;
		double cm =161.8;
		float n = 44.3f;
		char blood = 'A';
 
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : " + name);
		if(female = true)
		{
			gender = "여자";
		}
		else
			gender = "남자";
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age+ "세");
		System.out.println("키 : " + cm + "cm");
		System.out.println("몸무게 : " + n + "kg");
		System.out.println("혈액형 : "+ blood + "형");
	}

}
