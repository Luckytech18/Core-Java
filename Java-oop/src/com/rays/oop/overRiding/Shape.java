package com.rays.oop.overRiding;

public class Shape {
	protected String colour;
	protected int borderwidth;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	
	public double area() {
		return 0.0;
	}
}
