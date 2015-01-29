package com.kat.sample;



public class Border {
	private int maxRow;
	private int maxCol;
	private int minRow;
	private int minCol;
	
	
	public Border(int maxRow, int maxCol, int minRow, int minCol) {
		super();
		this.maxRow = maxRow;
		this.maxCol = maxCol;
		this.minRow = minRow;
		this.minCol = minCol;
	}

	public class EndOfTrailException extends RuntimeException {
		
	}
	
	public void checkEndOfTrail(Step s, Direction dir) {
		if ( (dir == Direction.DOWN && s.getRow() == maxRow) ||
				(dir == Direction.UP && s.getRow() == minRow) ||
				(dir == Direction.RIGHT && s.getCol() == maxCol) ||
				(dir == Direction.LEFT && s.getCol() == minCol) )
			throw new EndOfTrailException();
	}

	public int getMaxRow() {
		return maxRow;
	}

	public void setMaxRow(int maxRow) {
		this.maxRow = maxRow;
	}

	public int getMaxCol() {
		return maxCol;
	}

	public void setMaxCol(int maxCol) {
		this.maxCol = maxCol;
	}

	public int getMinRow() {
		return minRow;
	}

	public void setMinRow(int minRow) {
		this.minRow = minRow;
	}

	public int getMinCol() {
		return minCol;
	}

	public void setMinCol(int minCol) {
		this.minCol = minCol;
	}
	
	
}
