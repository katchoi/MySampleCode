package com.kat.sample;



public class AntiClockwiseSpiralWalker implements Walker {

	
	private String[][] walkOn;


	private Direction direction = Direction.DOWN;
	private Step step = new Step(0,0, direction);
	private Step nextStep = direction.step();

	
	
	public AntiClockwiseSpiralWalker(String[][] walkOn) {
		super();
		this.walkOn = walkOn;
		step.setBorder(new Border(walkOn.length-1, walkOn[0].length-1, 0, 0));

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

	
	@Override
	public void walk() {
		try {
			step.moveTo(nextStep);					// move to next step
		} catch (Border.EndOfTrailException e) {	// end of trail reached
				direction = antiClockwiseTurn();						// make a turn based on the current direction
				step.setBorder(direction.border(step.getBorder()));		// update boarder
				nextStep = direction.step();							// setup new step value for new direction
				step.moveTo(nextStep);									// move to next step
		}
	}


	@Override
	public String valueAt() {
		return walkOn[step.getRow()][step.getCol()];
	}


}
