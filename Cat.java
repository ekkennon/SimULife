/**
 * 
 */
package com.ekkapps.simulife;

/**
 * @author Erin
 *
 */
public class Cat extends Animal {

	public Cat() {
		super.addNoise(new Meow());
		super.addNoise(new Growl());
		super.addNoise(new Purr());
		super.addMove(new Walk());
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