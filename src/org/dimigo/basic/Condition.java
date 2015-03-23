package org.dimigo.basic;

public class Condition {
	
	public static void main(String[] args) {
		
		int speed = 10;
		String type = "경차";
		int pay=0;
		
		switch(type) {
		case "고속버스":
			pay = 850;
			break;
		case "경차":
			pay = 300;
			break;
		default :
			pay = 600;
			break;
		}
		int mul = (speed/10);
		
		pay = pay * mul;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + speed + "km");
		System.out.println("차종 : " + type);
		System.out.println("통행료 : " + pay + "원");
		
	}

}
