package jab.module;

import java.util.Iterator;

/**
 * Select enemy
 * 
 * @author jabier.martinez
 */
public class SelectEnemy extends Part {

	public Module bot;

	public SelectEnemy(Module bot) {
		this.bot = bot;
	}

	public void select() {
		Iterator<jab.module.BotInfo> iterator = bot.botsInfo.values().iterator();
		double minEnergy = Double.MAX_VALUE;
		jab.module.BotInfo selected = null;
		while (iterator.hasNext()) {
			jab.module.BotInfo e = iterator.next();
			if (minEnergy > e.energy) {
				selected = e;
				minEnergy = e.energy;
			}
		}
		bot.enemy = selected;
	}

}
