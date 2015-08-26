package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		IPhone i = new IPhone("IPhone 6","애플",7000000);
		System.out.println(i);
		i.turnOn();
		i.pay();
		i.useAirDrop();
		i.turnOff();
		Galaxy g = new Galaxy("갤럭시 S6", "삼성", 650000);
		System.out.println(g);
		g.turnOn();
		g.pay();
		g.useWirelessCharging();
		g.turnOff();

	}

}
