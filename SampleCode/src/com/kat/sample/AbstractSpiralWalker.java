package com.kat.sample;



public abstract class AbstractSpiralWalker implements Walker {

private String[][] walkOn;


	protected Direction direction;
	private Step step;
	private Step nextStep;

	
	
	public AbstractSpiralWalker(String[][] walkOn, Direction dir) {
		super();
		this.walkOn = walkOn;
		this.direction = dir;
		step = new Step(0,0, direction);
		nextStep = direction.step();
		step.setBorder(new Border(walkOn.length-1, walkOn[0].length-1, 0, 0));

	}


	protected abstract Direction makeTurn();

	
	@Override
	public void walk() {
		try {
			step.moveTo(nextStep);					// move to next step
		} catch (Border.EndOfTrailException e) {	// end of trail reached
				direction = makeTurn();									// make a turn based on the current direction
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
