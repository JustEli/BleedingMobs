package me.snowleo.goremod;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;


class ParticleBlockListener extends BlockListener
{
	private final transient IGoreMod goreMod;

	public ParticleBlockListener(final IGoreMod goreMod)
	{
		this.goreMod = goreMod;
	}

	@Override
	public void onBlockBreak(final BlockBreakEvent event)
	{
		if (goreMod.isUnbreakable(event.getBlock().getLocation()))
		{
			event.setCancelled(true);
		}
	}
}
