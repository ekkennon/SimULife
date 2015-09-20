/**
 * 
 */
package com.ekkapps.simulife;

/**
 * @author Erin
 *
 */
public class Dog extends Animal {

	public Dog() {
		super.addNoise(new Bark());
		super.addNoise(new Growl());
		super.addMove(new Walk());
		super.addMove(new Swim());
		super.setNumLegs(4);
		super.setTail(true);
	}
	
	public void addSound(SoundBehaviour n) {
		super.addNoise(n);
	}
	
	public void addMove(MoveBehaviour m) {
		super.addMove(m);
	}
}