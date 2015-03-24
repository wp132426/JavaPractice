package org.dimigo.basic;

public class Condition {
	
	public static void main(String[] args) {
		
		int speed = 10;
		String type = "고속버스";
		int pay;
		int plus_pay=200;
		int mul=0;
		
		switch(type) {
		case "고속버스":
			pay = 850;
			plus_pay=300;
			break;
		case "경차":
			pay = 300;
			break;
		default :
			pay = 600;
			break;
		}
		int an=speed%10;
		
		if(an!=0)
			mul=(speed/10);
		else
			mul=(speed/10)-1;
		
		pay += plus_pay * mul;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + speed + "km");
		System.out.println("차종 : " + type);
		System.out.println("통행료 : " + pay + "원");
		
	}

}
