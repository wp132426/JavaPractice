package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		int total = 0;
		Snack[] snacks = new Snack[] {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		for(Snack snack : snacks)
		{
			snack.printSnack();
			total += snack.calcPrice();
		}
		System.out.println(total);
	}

}
