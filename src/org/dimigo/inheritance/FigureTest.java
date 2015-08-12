package org.dimigo.inheritance;

public class FigureTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println(c.calcArea());
		
		Triangle t = new Triangle(10,10,5,8);
		System.out.println(t.calcArea());
		
		Rectangle r = new Rectangle(20,20,5,8);
		System.out.println(r.calcArea());
		
	}

}
