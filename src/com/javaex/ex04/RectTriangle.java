package com.javaex.ex04;

public class RectTriangle extends Shape {
	
	private double width;
	private double height;
	public RectTriangle() {
		super();
	}
	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "RectTriangle [width=" + width + ", height=" + height + "]";
	}
	
	public double getArea() {
		double result = (width * height) / 2;
		return result;
	}

	public double getPerimeter() {
		double result2 = width + height +Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
		return result2;
	}
	
}