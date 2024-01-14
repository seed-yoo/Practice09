package com.javaex.ex04;

public abstract class Shape {
    
	private int countSides;
	
    public Shape() {
		super();
	}
    

	public Shape(int countSides) {
		super();
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}


	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}
	
	@Override
	public String toString() {
		return "Shape [countSides=" + countSides + "]";
	}


	public abstract double getArea(); // 넓이

    public abstract double getPerimeter(); // 둘레 길이
    
}
