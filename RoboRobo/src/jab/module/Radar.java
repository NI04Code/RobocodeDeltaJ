package jab.module;

import robocode.util.Utils;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

/**
 * Radar
 * 
 * @author jab
 */
public class Radar extends Part {

	public Module bot;

	public Radar(Module bot) {
		this.bot = bot;
	}

	public void scan() {
		double angle = Utils.normalAbsoluteAngle(Math.atan2(aimX - bot.getX(), aimY - bot.getY()));
		bot.setTurnRadarRightRadians(Utils.normalRelativeAngle(angle - bot.getRadarHeadingRadians()));
	}

	int aimX;
	int aimY;

	public void listenInput(InputEvent e) {
		if (e instanceof MouseEvent) {
			aimX = ((MouseEvent) e).getX();
			aimY = ((MouseEvent) e).getY();
		}
	}

}
