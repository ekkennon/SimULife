/**
 * 
 */
package com.ekkapps.simulife;

import java.util.ArrayList;

/**
 * @author Erin
 *
 */
public class Animal {
	private int numLegs;
	private boolean tail;
	private ArrayList<SoundBehaviour> noise;
	private ArrayList<MoveBehaviour> move;
	
	public Animal() {
		
	}

	/**
	 * @return the numLegs
	 */
	public int getNumLegs() {
		return numLegs;
	}

	/**
	 * @param numLegs the numLegs to set
	 */
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

	/**
	 * @return the tail
	 */
	public boolean hasTail() {
		return tail;
	}

	/**
	 * @param tail the tail to set
	 */
	public void setTail(boolean tail) {
		this.tail = tail;
	}

	/**
	 * @return the noise
	 */
	public ArrayList<SoundBehaviour> getNoise() {
		return noise;
	}

	/**
	 * @param noise the noise to set
	 */
	public void setNoise(ArrayList<SoundBehaviour> noise) {
		this.noise = noise;
	}
	
	/**
	 * @param noise the noise to add
	 */
	public void addNoise(SoundBehaviour n) {
		noise.add(n);
	}

	/**
	 * @return the move
	 */
	public ArrayList<MoveBehaviour> getMove() {
		return move;
	}

	/**
	 * @param move the move to set
	 */
	public void setMove(ArrayList<MoveBehaviour> move) {
		this.move = move;
	}
	
	/**
	 * @param move the move to set
	 */
	public void addMove(MoveBehaviour m) {
		move.add(m);
	}
}