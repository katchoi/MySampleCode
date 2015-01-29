package com.kat.sample;



public class AntiClockwiseSpiralWalker extends AbstractSpiralWalker implements Walker {

	private static final Direction dftDir = Direction.DOWN;
	
	public AntiClockwiseSpiralWalker(String[][] walkOn) {
		super(walkOn, dftDir);
		// TODO Auto-generated constructor stub
	}



	@Override
	protected Direction makeTurn() {
		return antiClockwiseTurn();
	}


	private Direction antiClockwiseTurn() {
		switch(direction) {
		case RIGHT:
			return Direction.UP;
			
		case DOWN:
			return Direction.RIGHT;
			
		case LEFT:
			return Direction.DOWN;
				
		case UP:
			return Direction.LEFT;
		}
		
		return null;
	}


}
