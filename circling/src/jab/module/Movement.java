package jab.module;

import robocode.HitWallEvent;

/**
 * Movement
 * 
 * @author jab
 */
public class Movement extends Part {

	public Module bot;

	public Movement(Module bot) {
		this.bot = bot;
	}

	public void move() {
		bot.setMaxVelocity(5);
		bot.setAhead(Double.POSITIVE_INFINITY);
		bot.setTurnRight(Double.POSITIVE_INFINITY);
	}

	private int moveDirection;
	private int turnRightValue = 45;

	public void listen(robocode.Event e) {
		if (e instanceof HitWallEvent) {
			bot.setTurnRight(45);
		}
	}

}
