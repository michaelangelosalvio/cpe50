package com.cpe50.s20170731;

public class Square extends Line {
	private Line l2;
	

	public Square(int x, int y, Point c2, Line l2) {
		super(x, y, c2);
		this.l2 = l2;
	}

	public Line getL2() {
		return l2;
	}

	public void setL2(Line l2) {
		this.l2 = l2;
	}
		
	
	public double getWidth(){
		return super.getDistance();		
	}
	
	public double getHeight(){
		return l2.getDistance();		
	}
	
	public double getArea(){
		return getWidth() * getHeight();
	}
	
	
}
