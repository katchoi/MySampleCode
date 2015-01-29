package com.kat.sample;



public class Step {
	public static final Step _toRight = new Step(0,1, Direction.RIGHT);
	public static final Step _toLeft = new Step(0,-1, Direction.LEFT);
	public static final Step _toDown = new Step(1,0, Direction.DOWN);
	public static final Step _toUp = new Step(-1,0, Direction.UP);
	
	private int row;
	private int col;
	private Direction direction;
	private Border border;
	

	
	public Step(int row, int col, Direction direction) {
		super();
		this.row = row;
		this.col = col;
		this.direction = direction;
	}
	
	
	public Direction getDirection() {
		return direction;
	}


	public void setDirection(Direction direction) {
		this.direction = direction;
	}


	public Border getBorder() {
		return border;
	}


	public void setBorder(Border border) {
		this.border = border;
	}



	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getCol() {
		return col;
	}


	public void setCol(int col) {
		this.col = col;
	}


	public Step moveTo(Step p) {
		

		border.checkEndOfTrail(this,p.getDirection());
				
		row += p.row;
		col += p.col;
		return this;
	}
	
}
