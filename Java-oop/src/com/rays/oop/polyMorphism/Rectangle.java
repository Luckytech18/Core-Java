package com.rays.oop.polyMorphism;

public class Rectangle extends Shape {
	private int length;
	private int widht;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidht() {
		return widht;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}
	@Override
	public double area() {
		double area = length * widht;
		return area;
	}
}
