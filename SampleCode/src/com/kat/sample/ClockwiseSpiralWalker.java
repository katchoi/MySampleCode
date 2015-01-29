package com.kat.sample;



public class ClockwiseSpiralWalker extends AbstractSpiralWalker implements Walker {
	private static final Direction dftDir = Direction.RIGHT;
	
		
	
	
	public ClockwiseSpiralWalker(String[][] walkOn) {
		super(walkOn, dftDir);
	}

	@Override
	protected Direction makeTurn() {
		
		return clockwiseTurn();
	}
	
	private Direction clockwiseTurn() {
		switch(direction) {
		case RIGHT:
			return Direction.DOWN;
			
		case DOWN:
			return Direction.LEFT;
			
		case LEFT:
			return Direction.UP;
				
		case UP:
			return Direction.RIGHT;
		}
		
		return null;
	}

	



}
