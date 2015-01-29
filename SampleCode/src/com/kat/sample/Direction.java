package com.kat.sample;


public enum Direction {
	LEFT, DOWN, RIGHT, UP;
	
	

	
	public Step step() {
		switch(this) {
		case RIGHT:
			return Step._toRight;
			
		case DOWN:
			return Step._toDown;
			
		case LEFT:
			return Step._toLeft;
			
		case UP:
			return Step._toUp;
		}
		
		return null;
	}
	
	public Border border(Border b) {
		switch(this) {
		case RIGHT:
			b.setMinCol(b.getMinCol()+1);
			return b;
			
		case DOWN:
			b.setMinRow(b.getMinRow()+1);
			return b;
			
		case LEFT:
			b.setMaxCol(b.getMaxCol()-1);
			return b;
			
		case UP:
			b.setMaxRow(b.getMaxRow()-1);
			return b;
		}
		
		return null;
	}
}

