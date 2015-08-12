package org.dimigo.inheritance;

public class Figure {

	private int centerX;
	private int centerY;
	
	public Figure(){
		
	}
	
	public Figure(int centerX, int centerY){
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea(){
		return 0.0;
	}
}
