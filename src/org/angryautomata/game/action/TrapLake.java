package org.angryautomata.game.action;

import org.angryautomata.game.Game;
import org.angryautomata.game.Population;
import org.angryautomata.game.Position;

public class TrapLake extends Action implements Trap
{
	public TrapLake()
	{
		super(1);
	}

	@Override
	public void execute(Game game, Population population)
	{
		Position self = population.getPosition();

		game.getSceneryAt(self).setTrapped(true);
		population.updateGradient(-1);
	}

	@Override
	public boolean updatesMap()
	{
		return true;
	}

	@Override
	public boolean updatesPosition()
	{
		return false;
	}
}
