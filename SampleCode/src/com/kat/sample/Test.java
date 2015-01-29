package com.kat.sample;



public class Test {
	
	public static void main(String[] argv) {
// 		test data
//		String[][] walkOn = {{"1", "2", "3", "4", "5"}, {"14", "15", "16", "17", "6"}, {"13", "20", "19", "18", "7"}, {"12", "11", "10", "9", "8"} };
		
		// usage: n m ... follow by n x m number of string vales 
		// sample input: 4 5 "1" "2" "3" "4" "5" "14" "15" "16" "17" "6" "13" "20" "19" "18" "7" "12" "11" "10" "9" "8"
		String[] tokens = argv;
		
		// there is no error checking for quickness
		int row = Integer.parseInt(tokens[0]);
		int col = Integer.parseInt(tokens[1]);
		
		String[][] walkOn = new String[row][col];
		
		int i = 2;
		for(int r = 0; r<row; r++) {
			for(int c=0; c<col; c++) {
				walkOn[r][c] = tokens[i++];
			}
		}

		Walker cw = new ClockwiseSpiralWalker(walkOn);
		System.out.println("Clockwise Spiral Printing ....");
	    try {
	    	while (true) {
	    		System.out.println(cw.valueAt());
	    		cw.walk();
	    	}
		} catch (Border.EndOfTrailException e) {
			System.out.println("No more move ....");
		}
	    
	    
		Walker acw = new AntiClockwiseSpiralWalker(walkOn);
		System.out.println("Anti-Clockwise Spiral Printing ....");
	    try {
	    	while (true) {
	    		System.out.println(acw.valueAt());
	    		acw.walk();
	    	}
		} catch (Border.EndOfTrailException e) {
			System.out.println("No more move ....");
		}
	}

}


