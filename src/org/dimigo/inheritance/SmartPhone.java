package org.dimigo.inheritance;

public class SmartPhone {

	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
		
	}
	
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(model + "의 전원을 킵니다.");
	}
	
	public void turnOff(){
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay(){
		System.out.println("로 결제합니다.");
	}
	
	public void useSpecialFunction(){
		if(this instanceof IPhone) {
			((IPhone) this).useAirDrop();
		}
		
		if(this instanceof Galaxy) {
			((Galaxy) this).useWirelessCharging();
		}
	}
	
	public String toString(){
		return "제품명 : "+model+", 회사명 : "+company+"가격"+String.format("%,d", price);
	}
}
