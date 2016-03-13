/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public static final String CN = "CheckerboardKarel";

	// You fill in this part

	//precondition: Karel is in bottom left corner (1,1) facing East
	//postcondition: Karel is in bottom right corner (1,8) facing East

	public void run() {
		for (int i=0; i<4; i++){
			buildOddPillar();
			buildEvenPillar();
		}
	}

	private void buildOddPillar() {
		turnLeft();
		while ( frontIsClear() ) {
			putBeeper();
			move();
			if ( frontIsClear() ) {
				move();
			}
		}
		if (!frontIsClear()) {
			turnRight();
			move();
		}
	}

	private void buildEvenPillar() {
		turnRight(); 
		while ( frontIsClear() ) {
			putBeeper();
			move();
			if ( frontIsClear() ) {
				move();
			}
		}
		if (!frontIsClear()) {
			turnLeft();
			if( frontIsClear() ){
				move();
			}
		}
	}
}
